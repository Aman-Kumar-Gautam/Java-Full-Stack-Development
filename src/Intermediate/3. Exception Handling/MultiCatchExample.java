// Example demonstrating Catching Multiple Exceptions in a Single catch Block
public class MultiCatchExample {

    public static void main(String[] args) {
        System.out.println("Demonstrating Multi-Catch Blocks\n");

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
            //int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}
