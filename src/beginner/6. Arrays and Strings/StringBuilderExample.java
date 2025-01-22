// StringBuilderExample.java

public class StringBuilderExample {
    public static void main(String[] args) {
        // Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Appending to StringBuilder
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // Inserting into StringBuilder
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // Replacing content in StringBuilder
        sb.replace(6, 10, "Universe");
        System.out.println("After replace: " + sb); // Output: Hello Universe World

        // Deleting content in StringBuilder
        sb.delete(5, 14);
        System.out.println("After delete: " + sb); // Output: Hello World

        // Reversing the StringBuilder content
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH

        // Converting StringBuilder to String
        String result = sb.toString();
        System.out.println("Converted to String: " + result); // Output: dlroW olleH
    }
}
