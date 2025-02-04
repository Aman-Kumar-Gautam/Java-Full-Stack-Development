import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks for execution
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " started by thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(2000); // Simulate task execution time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + taskId + " completed by thread " + Thread.currentThread().getName());
            });
        }

        // Shutdown the executor service gracefully
        executor.shutdown();
    }
}
