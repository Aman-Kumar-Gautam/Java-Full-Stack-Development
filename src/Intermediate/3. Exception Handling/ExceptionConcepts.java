public class ExceptionConcepts {

    public static void main(String[] args) {
        System.out.println("Demonstrating Exceptions in Java\n");

        // Example of exception handling
        try {
            int division = divide(10, 0);
            System.out.println("Result: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. Cleanup can be done here.");
        }

        // Commonly used exceptions example
        try {
            //String str = null;
            //System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            throwCheckedException(); // Example of a checked exception
        } catch (Exception e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        }
    }

    // Method demonstrating a checked exception
    public static void throwCheckedException() throws Exception {
        throw new Exception("This is a checked exception");
    }

    // Method to demonstrate the throw keyword
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}