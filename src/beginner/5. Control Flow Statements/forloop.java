// File: forloop.java
public class forloop {
    public static void main(String[] args) {
        // Explanation of for loop:
        // A 'for' loop is used to repeat a block of code a specific number of times.
        // It consists of three parts:
        // 1. Initialization: This sets the starting point of the loop.
        // 2. Condition: This is the condition that must be true for the loop to execute.
        // 3. Update: This modifies the loop variable after each iteration.

        System.out.println("Example 1: Printing numbers from 1 to 5");
        
        // Example 1: Basic for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Current number: " + i);
        }

        // Let's break down this loop:
        // 1. Initialization: int i = 1; (the loop starts with i = 1)
        // 2. Condition: i <= 5; (the loop runs as long as i is less than or equal to 5)
        // 3. Update: i++ (after each iteration, i is incremented by 1)

        System.out.println("\nExample 2: Iterating through an array");

        // Example 2: Using for loop to iterate through an array
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }

        // In this loop:
        // 1. Initialization: int i = 0; (start from the first index of the array)
        // 2. Condition: i < fruits.length; (loop runs until i is less than the length of the array)
        // 3. Update: i++ (increment i to move to the next index)

        System.out.println("\nExample 3: Nested for loop");

        // Example 3: Nested for loop
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println(); // Move to the next line after inner loop finishes
        }

        // Explanation:
        // The outer loop controls the rows, while the inner loop controls the columns.
        // For each iteration of the outer loop, the inner loop runs completely.

        System.out.println("\nExample 4: Enhanced for loop (for-each loop)");

        // Example 4: Enhanced for loop (for-each loop)
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Explanation:
        // The enhanced for loop simplifies iterating through arrays or collections.
        // Here, 'fruit' is a variable that takes the value of each element in the 'fruits' array.

        System.out.println("\nEnd of for loop examples!");
    }
}