// StringBufferExample.java

public class StringBufferExample {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Appending to StringBuffer
        sb.append(" World");
        System.out.println("After append: " + sb); // Output: Hello World

        // Inserting into StringBuffer
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb); // Output: Hello Java World

        // Replacing content in StringBuffer
        sb.replace(6, 10, "Universe");
        System.out.println("After replace: " + sb); // Output: Hello Universe World

        // Deleting content in StringBuffer
        sb.delete(5, 14);
        System.out.println("After delete: " + sb); // Output: Hello World

        // Reversing the StringBuffer content
        sb.reverse();
        System.out.println("After reverse: " + sb); // Output: dlroW olleH

        // Converting StringBuffer to String
        String result = sb.toString();
        System.out.println("Converted to String: " + result); // Output: dlroW olleH
    }
}