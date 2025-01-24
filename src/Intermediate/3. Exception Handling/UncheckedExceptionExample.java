// Example demonstrating Unchecked Exceptions
public class UncheckedExceptionExample {

    public static void main(String[] args) {
        System.out.println("Demonstrating Unchecked Exceptions\n");

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }

    // Method demonstrating Unchecked Exception
    public static int divide(int a, int b) {
        return a / b; // This can throw an ArithmeticException if b is 0
    }
}
