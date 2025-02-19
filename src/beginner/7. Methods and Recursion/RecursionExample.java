public class RecursionExample {
    
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        else {
            return n * factorial(n - 1);
        }
    }
    
    // Main method to test recursion with factorial
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result); // Output: Factorial of 5 is: 120
    }
}
