// PassByValueExample.java
// Demonstrates "pass by value" in Java

public class PassByValueExample {

    // Method to modify a primitive type
    public static void modifyPrimitive(int num) {
        num = num + 5; // Modify the local copy
        System.out.println("Inside modifyPrimitive: " + num); // Output: Modified local value
    }

    // Method to modify an object reference
    public static void modifyReference(StringBuilder str) {
        str.append(" World"); // Modify the object referenced
        System.out.println("Inside modifyReference: " + str.toString()); // Output: Modified value
    }

    // Method to reassign an object reference
    public static void reassignReference(StringBuilder str) {
        str = new StringBuilder("New String"); // Reassign the reference locally
        System.out.println("Inside reassignReference: " + str.toString()); // Output: New reference
    }

    public static void main(String[] args) {
        // Example 1: Primitive Type
        int x = 10;
        System.out.println("Before modifyPrimitive: " + x); // Output: 10
        modifyPrimitive(x);
        System.out.println("After modifyPrimitive: " + x); // Output: 10 (unchanged)

        System.out.println();

        // Example 2: Object Reference
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before modifyReference: " + sb.toString()); // Output: Hello
        modifyReference(sb);
        System.out.println("After modifyReference: " + sb.toString()); // Output: Hello World (modified)

        System.out.println();

        // Example 3: Reassigning Object Reference
        StringBuilder sb2 = new StringBuilder("Original");
        System.out.println("Before reassignReference: " + sb2.toString()); // Output: Original
        reassignReference(sb2);
        System.out.println("After reassignReference: " + sb2.toString()); // Output: Original (unchanged)
    }
}
