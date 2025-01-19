// LogicalOperators.java

// Demonstrates Logical AND (&&)
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // Logical AND
        System.out.println("Logical AND (&&):");
        System.out.println("a && b: " + (a && b)); // Output: false
        System.out.println("a && c: " + (a && c)); // Output: true

        // Logical OR
        System.out.println("\nLogical OR (||):");
        System.out.println("a || b: " + (a || b)); // Output: true
        System.out.println("b || b: " + (b || b)); // Output: false

        // Logical NOT
        System.out.println("\nLogical NOT (!):");
        System.out.println("!a: " + (!a)); // Output: false
        System.out.println("!b: " + (!b)); // Output: true

        // Logical XOR
        System.out.println("\nLogical XOR (^):");
        System.out.println("a ^ b: " + (a ^ b)); // Output: true
        System.out.println("a ^ c: " + (a ^ c)); // Output: false

        // Example with conditional statements
        int age = 25;
        boolean isStudent = true;
        boolean isMember = false;

        System.out.println("\nConditional Statements:");
        
        // Using AND (&&)
        if (age > 18 && isStudent) {
            System.out.println("Eligible for student discount.");
        } else {
            System.out.println("Not eligible for student discount.");
        }

        // Using OR (||)
        if (age < 18 || age > 60) {
            System.out.println("Eligible for special discount.");
        } else {
            System.out.println("Not eligible for special discount.");
        }

        // Using NOT (!)
        if (!isMember) {
            System.out.println("Please sign up to become a member.");
        }
    }
}
