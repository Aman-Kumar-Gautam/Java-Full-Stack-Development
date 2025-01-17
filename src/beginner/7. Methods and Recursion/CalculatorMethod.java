// Defining Method and Invoking Method in Java

// Class that defines multiple methods
public class CalculatorMethod {

    // Method to add two integers and return the result
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers and return the result
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers and return the result
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers and return the result
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) a / b;
    }

    // Method to print a custom message
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    // Static method to display a greeting
    public static void greet() {
        System.out.println("Welcome to the Calculator program!");
    }
}



