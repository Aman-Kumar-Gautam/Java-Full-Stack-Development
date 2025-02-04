// Thread class demonstrating lifecycle states
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());

        try {
            Thread.sleep(2000); // Simulate work (Thread enters TIMED_WAITING)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread completed: " + Thread.currentThread().getName());
    }
}

public class ThreadLifecycleExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();

        // NEW State
        System.out.println("Thread state after creation: " + thread.getState());

        // RUNNABLE State
        thread.start();
        System.out.println("Thread state after start(): " + thread.getState());

        try {
            Thread.sleep(500); // Give some time to change state to RUNNING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // RUNNING or TIMED_WAITING State (while sleeping)
        System.out.println("Thread state while running: " + thread.getState());

        try {
            thread.join(); // Wait for thread to complete
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TERMINATED State
        System.out.println("Thread state after completion: " + thread.getState());
    }
}
