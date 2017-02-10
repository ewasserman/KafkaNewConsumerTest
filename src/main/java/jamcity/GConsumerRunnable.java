package jamcity;

import com.jamcity.avro.codec.MessageDecoder;
import jc.analytics.Event;
import org.apache.avro.generic.GenericRecord;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.apache.kafka.common.serialization.ByteArrayDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

public class GConsumerRunnable extends ConsumerRunnable {
        private final KafkaConsumer<String, byte[]> consumer;
        private final AtomicBoolean closed = new AtomicBoolean(false);

        public GConsumerRunnable(String brokerList, int id, String groupId, List<String> topics) {
            super(brokerList, id, groupId, topics);
            Properties props = new Properties();
            props.put("bootstrap.servers", brokerList);
            props.put("group.id", groupId);
            props.put("key.deserializer", StringDeserializer.class.getName());
            props.put("value.deserializer", ByteArrayDeserializer.class.getName());
            this.consumer = new KafkaConsumer<>(props);
        }

        @Override
        public void run() {
            try {
                consumer.subscribe(topics);

                int cnt = 1000;
                while (!closed.get()) {
                    ConsumerRecords<String, byte[]> records = consumer.poll(Long.MAX_VALUE);
                    for (ConsumerRecord<String, byte[]> record : records) {
                        MessageDecoder decoder = MessageDecoder.forData(record.value());
                        GenericRecord ge = decoder.decodeGeneric(Event.getClassSchema()); // just using the schema from the specific record.
                        String aid = (String) ge.get("appId");
                        Long ts = (Long) ge.get("serverTimestamp");
                        String evt = (String) ge.get("eventJson");
                        String json = (String) ge.get("eventJson");
                        System.out.printf("key=%s value=GenericRecord[ appId=%s, srvTs=%d, event=%s, eventJSON=%s ]\n", record.key(), aid, ts, evt,
                            StringUtils.abbreviate(json, 30));
                        cnt -= 1;
                    }
                    if (cnt < 0) break;
                }
            } catch (WakeupException e) {
                // Ignore exception if closing
                if(!closed.get()) throw e;
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                consumer.close();
            }
        }

        /**
         * This may be safely called on a separate thread to shut down this consumer
         */
        public void shutdown() {
            closed.set(true);
            consumer.wakeup();
        }

}
