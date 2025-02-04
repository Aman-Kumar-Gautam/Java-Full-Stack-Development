// Counter class demonstrating synchronization
class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++; // Only one thread can execute this at a time
    }

    // Getter method (not synchronized since it's a read operation)
    public int getCount() {
        return count;
    }
}

// Class-level synchronization example
class SharedResource {
    public static synchronized void staticMethod() {
        System.out.println(Thread.currentThread().getName() + " executing static synchronized method.");
    }

    public void method() {
        synchronized (SharedResource.class) { // Synchronized block using class lock
            System.out.println(Thread.currentThread().getName() + " executing synchronized block.");
        }
    }
}

// Example demonstrating synchronized blocks
class CounterWithBlock {
    private int count = 0;

    public void increment() {
        synchronized (this) { // Synchronizing only this block
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Multiple threads incrementing the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count (expected 2000): " + counter.getCount());

        // Demonstrate Class-level synchronization
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(() -> resource.method());
        Thread t2 = new Thread(() -> SharedResource.staticMethod());

        t1.start();
        t2.start();
    }
}
