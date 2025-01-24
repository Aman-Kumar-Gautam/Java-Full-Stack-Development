// Example demonstrating try, catch, and finally blocks
public class ExceptionHandlingExample {

    public static void main(String[] args) {
        System.out.println("Demonstrating try, catch, and finally blocks\n");

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}
