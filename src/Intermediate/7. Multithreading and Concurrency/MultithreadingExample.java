import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 1. Extending Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }
}

// 2. Implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running: " + Thread.currentThread().getName());
    }
}

// 3. Thread Synchronization
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

// 4. Synchronized Block
class SyncBlockCounter {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        synchronized (this) {
            return count;
        }
    }
}

// 5. Thread Communication
class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

// 6. WorkerThread for Thread Pooling
class WorkerThread implements Runnable {
    private String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " processing task: " + taskName);
        try {
            Thread.sleep(1000); // Simulate task processing
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        System.out.println("### Multithreading Example ###");

        // 1. Creating and starting a thread using Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // 2. Creating and starting a thread using Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // 3. Demonstrating Synchronization
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Synchronized Counter Value: " + counter.getCount());

        // 4. Demonstrating Thread Communication
        Message message = new Message();

        Thread writer = new Thread(() -> {
            message.write("Hello from Writer Thread!");
        });

        Thread reader = new Thread(() -> {
            System.out.println("Message Read: " + message.read());
        });

        writer.start();
        reader.start();

        try {
            writer.join();
            reader.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // 5. Thread Pooling
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            executorService.execute(new WorkerThread("Task " + i));
        }
        executorService.shutdown();

        while (!executorService.isTerminated()) {
        }
        System.out.println("All tasks completed.");
    }
}
