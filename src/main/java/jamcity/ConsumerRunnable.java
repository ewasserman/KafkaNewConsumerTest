package jamcity;

import com.jamcity.avro.codec.MessageDecoder;
import jc.analytics.Event;
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

import com.jamcity.avro.kafka.SpecificKafkaAvroDeserializer;

public class ConsumerRunnable implements Runnable {
    private final KafkaConsumer<String, Event> consumer;
    private final List<String> topics;
    private final int id;
    private final AtomicBoolean closed = new AtomicBoolean(false);

    public ConsumerRunnable(String brokerList, int id, String groupId, List<String> topics) {
        this.id = id;
        this.topics = topics;
        Properties props = new Properties();
        props.put("bootstrap.servers", brokerList);
        props.put("group.id", groupId);
        props.put("key.deserializer", StringDeserializer.class.getName());
        props.put("value.deserializer", ByteArrayDeserializer.class.getName());
        final StringDeserializer keyDeserializer = new StringDeserializer();
        final SpecificKafkaAvroDeserializer<Event> valueDeserializer = new SpecificKafkaAvroDeserializer<>(Event.class);
        this.consumer = new KafkaConsumer<>(props, keyDeserializer, valueDeserializer);
    }

    @Override
    public void run() {
        try {
            consumer.subscribe(topics);

            int cnt = 1000;
            while (!closed.get()) {
                ConsumerRecords<String, Event> records = consumer.poll(Long.MAX_VALUE);
                for (ConsumerRecord<String, Event> record : records) {
                    Event e = record.value();
                    System.out.printf("key=%s value=Event[ appId=%s, srvTs=%d, event=%s, eventJSON=%s ]\n", record.key(), e.getAppId(), e.getServerTimestamp(), e.getEvent(),
                        StringUtils.abbreviate(e.getEventJson(), 30));
                    cnt -= 1;
                }
                if (cnt < 0) break;
            }
        } catch (WakeupException e) {
            // Ignore exception if closing
            if(!closed.get()) throw e;
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
