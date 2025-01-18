// Class to demonstrate static methods
public class StaticMethodsDemo {
    // Static method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Static method to calculate the power of a number
    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    // Main method
    public static void main(String[] args) {
        int number = 5;

        // Accessing static method for factorial
        int fact = StaticMethodsDemo.factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact); // Output: Factorial of 5 is: 120

        // Accessing static method for power calculation
        double base = 2.0;
        int exponent = 3;
        double result = StaticMethodsDemo.power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result); // Output: 2.0 raised to the power 3 is: 8.0
    }
}