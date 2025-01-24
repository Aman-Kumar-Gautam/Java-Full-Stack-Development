// File: ThrowsKeywordExample.java

public class ThrowsKeywordExample {

    // Method that throws an exception
    public static void checkAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {
        try {
            // Calling the method that may throw an exception
            checkAge(15);
        } catch (IllegalArgumentException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
