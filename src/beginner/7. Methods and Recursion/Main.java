// Class to demonstrate invoking methods
public class Main {
    public static void main(String[] args) {
        // Invoking a static method directly using the class name
        CalculatorMethod.greet();

        // Creating an instance of the Calculator class
        CalculatorMethod calc = new CalculatorMethod();

        // Invoking instance methods using the object
        int sum = calc.add(10, 5); // Calls the add method
        System.out.println("Sum: " + sum);

        int difference = calc.subtract(10, 5); // Calls the subtract method
        System.out.println("Difference: " + difference);

        int product = calc.multiply(10, 5); // Calls the multiply method
        System.out.println("Product: " + product);

        double quotient = calc.divide(10, 5); // Calls the divide method
        System.out.println("Quotient: " + quotient);

        // Invoking a method with a custom message
        calc.printMessage("Methods in Java make coding modular and reusable!");
    }
}