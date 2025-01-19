// Java program to demonstrate operator precedence
public class OperatorPrecedence {
    public static void main(String[] args) {

        // Example 1: Multiplicative vs Additive Operators
        int a = 10;
        int b = 5;
        int c = 2;

        int result1 = a + b * c; // Multiplication (*) has higher precedence than addition (+)
        System.out.println("Result1: " + result1); // Output: 20

        // Example 2: Using Parentheses to Change Precedence
        int result2 = (a + b) * c; // Parentheses change the order of evaluation
        System.out.println("Result2: " + result2); // Output: 30

        // Example 3: Relational vs Logical Operators
        int x = 10;
        int y = 20;
        int z = 30;

        boolean result3 = x < y && y < z; // Relational (<) evaluated before Logical AND (&&)
        System.out.println("Result3: " + result3); // Output: true

        // Example 4: Unary Operators vs Arithmetic Operators
        int p = 10;
        int q = 5;

        int result4 = p - ++q; // Unary increment (++) has higher precedence than subtraction (-)
        System.out.println("Result4: " + result4); // Output: 4

        // Example 5: Assignment Operators (Lowest Precedence)
        int m = 10;
        int n = 5;
        int result5 = m += n * 2; // Multiplication (*) is evaluated before addition-assignment (+=)
        System.out.println("Result5: " + result5); // Output: 20

        // Example 6: Ternary Operator
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible" : "Not Eligible"; // Ternary operator
        System.out.println("Eligibility: " + eligibility); // Output: Eligible

        // Example 7: Postfix vs Multiplicative Operators
        int num = 5;
        int result6 = num++ * 2; // Postfix increment (num++) is applied after multiplication (*)
        System.out.println("Result6: " + result6); // Output: 10
        System.out.println("Updated num: " + num); // Output: 6

        // Example 8: Logical NOT (!) and Relational Operators
        boolean isMember = false;
        if (!isMember) {
            System.out.println("Please sign up to become a member."); // Output: Please sign up to become a member.
        }
    }
}
