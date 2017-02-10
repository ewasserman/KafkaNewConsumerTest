package jamcity;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

abstract public class ConsumerRunnable implements Runnable {
    protected final List<String> topics;
    protected final int id;
    protected final AtomicBoolean closed = new AtomicBoolean(false);

    public ConsumerRunnable(String brokerList, int id, String groupId, List<String> topics) {
        this.id = id;
        this.topics = topics;
    }
}
