public class whileloop {
    public static void main(String[] args) {
        // Explanation of while loop:
        // A 'while' loop is used to execute a block of code repeatedly as long as the given condition is true.
        // It checks the condition before executing the loop body, making it a pre-condition loop.
        
        System.out.println("Example 1: Printing numbers from 1 to 5");
        
        // Example 1: Basic while loop
        int i = 1; // Initialization
        while (i <= 5) { // Condition
            System.out.println("Current number: " + i);
            i++; // Update
        }

        // Explanation of the loop:
        // 1. Initialization: i = 1; (we start from 1)
        // 2. Condition: i <= 5; (loop executes as long as i is less than or equal to 5)
        // 3. Update: i++; (increment i after each iteration)

        System.out.println("\nExample 2: Sum of numbers from 1 to 10");

        // Example 2: Using while loop to calculate the sum of numbers
        int sum = 0; // Initialize sum
        int num = 1; // Start from 1
        while (num <= 10) { // Condition
            sum += num; // Add the current number to sum
            num++; // Increment number
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        System.out.println("\nExample 3: Infinite loop with break");

        // Example 3: Infinite while loop with a break condition
        int counter = 1;
        while (true) { // Infinite loop
            System.out.println("Counter: " + counter);
            if (counter == 5) { // Exit condition
                break; // Breaks out of the loop
            }
            counter++; // Increment counter
        }

        // Explanation:
        // The loop runs indefinitely due to the condition 'true'.
        // The 'break' statement stops the loop when the counter reaches 5.

        System.out.println("\nExample 4: Using while loop with arrays");

        // Example 4: Iterating through an array using while loop
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        int index = 0; // Start from the first index
        while (index < fruits.length) { // Condition
            System.out.println("Fruit at index " + index + ": " + fruits[index]);
            index++; // Increment index
        }

        // Explanation:
        // 1. Start with the first index (index = 0).
        // 2. Loop runs while index is less than the array length.
        // 3. Increment the index after accessing each element.

        System.out.println("\nExample 5: Do-while loop");

        // Example 5: Do-while loop
        int number = 1; // Initialization
        do {
            System.out.println("Number (do-while): " + number);
            number++; // Update
        } while (number <= 3); // Condition

        // Explanation:
        // The 'do-while' loop executes the code block at least once, even if the condition is false.
        // After the first execution, it checks the condition before repeating.

        System.out.println("\nEnd of while loop examples!");
    }

}