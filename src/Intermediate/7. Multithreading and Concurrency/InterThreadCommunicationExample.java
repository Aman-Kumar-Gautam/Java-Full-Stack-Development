import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Shared resource for inter-thread communication
class SharedObject {
    private boolean flag = false;

    // Synchronized produce method
    public synchronized void produce() {
        while (flag) { // Wait while flag is true (consumer needs to consume first)
            try {
                wait(); // Release lock and wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producing...");
        flag = true;
        notify(); // Notify the waiting consumer thread
    }

    // Synchronized consume method
    public synchronized void consume() {
        while (!flag) { // Wait while flag is false (producer needs to produce first)
            try {
                wait(); // Release lock and wait
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consuming...");
        flag = false;
        notify(); // Notify the waiting producer thread
    }
}

// Alternative implementation using Lock and Condition
class SharedObjectWithLock {
    private boolean flag = false;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void produce() {
        lock.lock();
        try {
            while (flag) {
                condition.await(); // Wait while flag is true
            }
            System.out.println("Producing...");
            flag = true;
            condition.signal(); // Notify consumer
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consume() {
        lock.lock();
        try {
            while (!flag) {
                condition.await(); // Wait while flag is false
            }
            System.out.println("Consuming...");
            flag = false;
            condition.signal(); // Notify producer
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();
        SharedObjectWithLock sharedObjectWithLock = new SharedObjectWithLock();

        // Producer and Consumer using wait-notify mechanism
        Thread producerThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedObject.produce();
            }
        });

        Thread consumerThread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedObject.consume();
            }
        });

        producerThread1.start();
        consumerThread1.start();

        // Producer and Consumer using Lock and Condition
        Thread producerThread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedObjectWithLock.produce();
            }
        });

        Thread consumerThread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedObjectWithLock.consume();
            }
        });

        producerThread2.start();
        consumerThread2.start();
    }
}
