// Example demonstrating Multiple Catch Blocks
public class MultipleCatchExample {

    public static void main(String[] args) {
        System.out.println("Demonstrating Multiple Catch Blocks\n");

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will throw ArrayIndexOutOfBoundsException
            //int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}
