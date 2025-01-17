// File: dowhile.java
public class doWhileloop {
    public static void main(String[] args) {
        // Explanation of do-while loop:
        // A 'do-while' loop is similar to a 'while' loop, but the main difference is that
        // the code inside the loop executes at least once, even if the condition is false.
        // It checks the condition after executing the loop body.

        System.out.println("Example 1: Printing numbers from 1 to 5");

        // Example 1: Basic do-while loop
        int i = 1; // Initialization
        do {
            System.out.println("Current number: " + i);
            i++; // Update
        } while (i <= 5); // Condition

        // Explanation:
        // 1. The loop executes the block of code first (print and increment i).
        // 2. Then it checks if the condition (i <= 5) is true to decide whether to repeat.

        System.out.println("\nExample 2: Sum of numbers from 1 to 10");

        // Example 2: Using do-while loop to calculate the sum of numbers
        int sum = 0; // Initialize sum
        int num = 1; // Start from 1
        do {
            sum += num; // Add the current number to sum
            num++; // Increment number
        } while (num <= 10); // Condition
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        System.out.println("\nExample 3: Do-while loop with false condition");

        // Example 3: Do-while loop that runs once even if the condition is false
        int x = 10; // Initialization
        do {
            System.out.println("This will execute at least once, x = " + x);
        } while (x < 5); // Condition (false, but loop runs once)

        // Explanation:
        // Even though the condition (x < 5) is false, the loop body executes once.

        System.out.println("\nExample 4: Iterating through an array");

        // Example 4: Iterating through an array using do-while loop
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        int index = 0; // Start from the first index
        do {
            System.out.println("Fruit at index " + index + ": " + fruits[index]);
            index++; // Increment index
        } while (index < fruits.length); // Condition

        // Explanation:
        // 1. The loop starts with the first index.
        // 2. It runs the loop body (print the fruit and increment the index).
        // 3. Then it checks if the index is within bounds of the array.

        System.out.println("\nExample 5: Infinite do-while loop with break");

        // Example 5: Infinite do-while loop with a break statement
        int counter = 1;
        do {
            System.out.println("Counter: " + counter);
            if (counter == 5) { // Exit condition
                break; // Breaks out of the loop
            }
            counter++; // Increment counter
        } while (true); // Infinite condition

        // Explanation:
        // The loop runs indefinitely due to the 'true' condition.
        // The 'break' statement stops the loop when counter reaches 5.

        System.out.println("\nEnd of do-while loop examples!");
    }
}