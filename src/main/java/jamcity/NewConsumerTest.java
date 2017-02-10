package jamcity;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NewConsumerTest {
    public static String brokerList =
        "10.5.98.48:9092,10.5.98.47:9092,10.5.98.45:9092,10.5.98.46:9092," +
            "10.5.99.83:9092,10.5.99.82:9092,10.5.99.81:9092,10.5.99.80:9092," +
            "10.5.100.5:9092,10.5.100.4:9092,10.5.100.7:9092,10.5.100.6:9092";

    private int poolSize;
    private String groupId;
    private List<String> topics;
    private ExecutorService pool;

    public static void main(String[] args) {
        String group = args[0];
        System.out.printf("Using consumer group: %s", group);
        NewConsumerTest t = new NewConsumerTest(2, Arrays.asList("analytics.event"), group);
        t.run();
        t.shutdownAndAwaitTermination(t.pool);
    }


    public NewConsumerTest(int poolSize, List<String> topics, String groupId) {
        this.poolSize = poolSize;
        this.groupId = groupId;
        this.topics = topics;
        this.pool = Executors.newFixedThreadPool(poolSize);
    }


    void run() {
        try {
            for (int i=0; i < poolSize; ++i) {
                pool.execute(new ConsumerRunnable(brokerList, i, groupId, topics));
            }
        } catch (Throwable ex) {
            ex.printStackTrace();
            pool.shutdown();
        }
    }

    void shutdownAndAwaitTermination(ExecutorService pool) {
        pool.shutdown(); // Disable new tasks from being submitted
        try {
            // Wait a while for existing tasks to terminate
            if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
                pool.shutdownNow(); // Cancel currently executing tasks
                // Wait a while for tasks to respond to being cancelled
                if (!pool.awaitTermination(60, TimeUnit.SECONDS))
                    System.err.println("Pool did not terminate");
            }
        } catch (InterruptedException ie) {
            // (Re-)Cancel if current thread also interrupted
            pool.shutdownNow();
            // Preserve interrupt status
            Thread.currentThread().interrupt();
        }
    }
}
