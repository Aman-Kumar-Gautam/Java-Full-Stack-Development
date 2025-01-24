/*  Define the custom checked exception
public class InvalidAgeException extends Exception {
    // Constructor accepting message
    public InvalidAgeException(String message) {
        super(message);
    }

    // Constructor accepting message and cause
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Using the custom checked exception in a method
public class CustomCheckedExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws the custom exception if age is less than 18
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
        System.out.println("Valid age");
    }
}
*/