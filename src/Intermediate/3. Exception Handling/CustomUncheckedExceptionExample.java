/*// Define the custom unchecked exception
public class InvalidAgeRuntimeException extends RuntimeException {
    // Constructor accepting message
    public InvalidAgeRuntimeException(String message) {
        super(message);
    }

    // Constructor accepting message and cause
    public InvalidAgeRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Using the custom unchecked exception in a method
public class CustomUncheckedExceptionExample {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception
        } catch (InvalidAgeRuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method that throws the custom unchecked exception if age is less than 18
    public static void validateAge(int age) {
        if (age < 18) {
            throw new InvalidAgeRuntimeException("Age must be 18 or older");
        }
        System.out.println("Valid age");
    }
}
*/