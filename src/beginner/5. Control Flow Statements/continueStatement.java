// File: continueStatement.java
public class continueStatement {
    public static void main(String[] args) {
        // Explanation of continue statement:
        // The 'continue' statement is used to skip the current iteration of a loop.
        // When encountered, it skips the remaining code in the loop body for the current iteration
        // and proceeds with the next iteration of the loop.

        System.out.println("Example 1: Continue in a for loop");

        // Example 1: Using continue in a for loop
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip the current iteration if i is even
            }
            System.out.println("Odd number: " + i);
        }

        // Explanation:
        // The loop skips printing even numbers and continues with the next iteration.

        System.out.println("\nExample 2: Continue in a while loop");

        // Example 2: Using continue in a while loop
        int num = 0;
        while (num < 10) {
            num++;
            if (num % 3 == 0) {
                continue; // Skip the iteration if num is divisible by 3
            }
            System.out.println("Number not divisible by 3: " + num);
        }

        // Explanation:
        // The loop skips numbers divisible by 3 and continues with the next iteration.

        System.out.println("\nExample 3: Continue in a nested loop");

        // Example 3: Using continue in nested loops
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == col) {
                    continue; // Skip the iteration if row equals col
                }
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }

        // Explanation:
        // The loop skips printing pairs where the row and column numbers are equal.

        System.out.println("\nExample 4: Using continue in a labeled loop");

        // Example 4: Labeled continue in nested loops
        outerLoop: // Label for the outer loop
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == col) {
                    continue outerLoop; // Skip the rest of the outer loop iteration
                }
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println(); // This will be skipped if continue outerLoop is executed
        }

        // Explanation:
        // The labeled continue skips the current iteration of the outer loop entirely.

        System.out.println("\nExample 5: Continue in an infinite loop");

        // Example 5: Using continue in an infinite loop
        int counter = 0;
        while (true) { // Infinite loop
            counter++;
            if (counter % 2 == 0) {
                continue; // Skip the even numbers
            }
            System.out.println("Odd counter: " + counter);
            if (counter >= 5) {
                break; // Exit the loop after reaching 5
            }
        }

        // Explanation:
        // The loop skips even numbers and breaks out after printing odd numbers up to 5.

        System.out.println("\nEnd of continue statement examples!");
    }
}