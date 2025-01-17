// File: breakStatement.java
public class breakStatement {
    public static void main(String[] args) {
        // Explanation of break statement:
        // The 'break' statement is used to exit a loop or a switch block prematurely.
        // When encountered, it immediately terminates the current loop or switch block
        // and transfers control to the next statement after the loop or switch.

        System.out.println("Example 1: Break in a for loop");

        // Example 1: Using break in a for loop
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Break at i = " + i);
                break; // Exit the loop when i equals 5
            }
            System.out.println("Current number: " + i);
        }

        // Explanation:
        // The loop prints numbers from 1 to 10, but it stops as soon as i equals 5.

        System.out.println("\nExample 2: Break in a while loop");

        // Example 2: Using break in a while loop
        int num = 1;
        while (num <= 10) {
            if (num == 7) {
                System.out.println("Breaking at num = " + num);
                break; // Exit the loop when num equals 7
            }
            System.out.println("Current number: " + num);
            num++;
        }

        // Explanation:
        // The loop prints numbers from 1 to 10, but stops when num equals 7.

        System.out.println("\nExample 3: Break in a nested loop");

        // Example 3: Using break in nested loops
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == 2 && col == 2) {
                    System.out.println("Breaking at row = " + row + ", col = " + col);
                    break; // Exit the inner loop when condition is met
                }
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }

        // Explanation:
        // The 'break' statement exits only the inner loop, while the outer loop continues.

        System.out.println("\nExample 4: Break in a switch statement");

        // Example 4: Using break in a switch statement
        int day = 3; // 1 = Monday, 2 = Tuesday, etc.
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break; // Exits the switch block after printing "Wednesday"
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Explanation:
        // The 'break' prevents the execution from falling through to the next case.

        System.out.println("\nExample 5: Break in an infinite loop");

        // Example 5: Using break in an infinite loop
        int counter = 1;
        while (true) { // Infinite loop
            System.out.println("Counter: " + counter);
            if (counter == 3) {
                System.out.println("Breaking the infinite loop");
                break; // Exit the loop when counter equals 3
            }
            counter++;
        }

        System.out.println("\nEnd of break statement examples!");
    }
}