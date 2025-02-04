// Example 1: Extending the Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread running: " + i + " (Thread Name: " + Thread.currentThread().getName() + ")");
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Example 2: Implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable running: " + i + " (Thread Name: " + Thread.currentThread().getName() + ")");
            try {
                Thread.sleep(1000); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CreatingThreadsExample {
    public static void main(String[] args) {
        System.out.println("### Creating Threads Example ###");

        // 1. Using Thread class
        MyThread thread1 = new MyThread();
        thread1.setName("ThreadClass-1");
        thread1.start(); // Start the new thread

        // 2. Using Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.setName("RunnableThread-1");
        thread2.start(); // Start the new thread

        // Main thread continues execution
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread running: " + i + " (Thread Name: " + Thread.currentThread().getName() + ")");
            try {
                Thread.sleep(500); // Simulate work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
