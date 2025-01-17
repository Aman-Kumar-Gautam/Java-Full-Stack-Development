import java.util.ArrayList;
import java.util.HashMap;

public class stringClass {
    public static void main(String[] args) {
        // 1. Creating Strings
        // Using String Literal
        String str1 = "Hello";
        String str2 = "World";

        // Using new Keyword
        String str3 = new String("Hello");
        String str4 = new String("World");

        // 2. String Methods

        // Length of a String
        String str = "Hello";
        int length = str.length();
        System.out.println("Length of 'Hello': " + length); // Output: 5

        // Concatenation
        String concatenated = str1 + " " + str2; // Using + operator
        String concatenatedUsingMethod = str1.concat(" ").concat(str2); // Using concat()
        System.out.println("Concatenated String: " + concatenated); // Output: Hello World
        System.out.println("Concatenated String (using method): " + concatenatedUsingMethod); // Output: Hello World

        // Substring
        String mainStr = "Hello World";
        String subStr1 = mainStr.substring(6); // Extract from index 6
        String subStr2 = mainStr.substring(0, 5); // Extract from index 0 to 5 (exclusive)
        System.out.println("Substring (from index 6): " + subStr1); // Output: World
        System.out.println("Substring (from index 0 to 5): " + subStr2); // Output: Hello

        // Comparison
        String strA = "hello";
        String strB = "Hello";
        boolean isEqual = strA.equals(strB); // Case-sensitive comparison
        boolean isEqualIgnoreCase = strA.equalsIgnoreCase(strB); // Case-insensitive comparison
        int compareResult = strA.compareTo(strB); // Lexicographical comparison
        System.out.println("Are 'hello' and 'Hello' equal? " + isEqual); // Output: false
        System.out.println("Are 'hello' and 'Hello' equal (ignore case)? " + isEqualIgnoreCase); // Output: true
        System.out.println("Lexicographical comparison result: " + compareResult); // Negative value

        // Searching
        int index = mainStr.indexOf("World"); // Find the first occurrence of "World"
        boolean startsWith = mainStr.startsWith("Hello"); // Check if it starts with "Hello"
        boolean endsWith = mainStr.endsWith("World"); // Check if it ends with "World"
        System.out.println("Index of 'World': " + index); // Output: 6
        System.out.println("Does the string start with 'Hello'? " + startsWith); // Output: true
        System.out.println("Does the string end with 'World'? " + endsWith); // Output: true

        // Conversion
        String upperCase = mainStr.toUpperCase(); // Convert to upper case
        String lowerCase = mainStr.toLowerCase(); // Convert to lower case
        System.out.println("Uppercase: " + upperCase); // Output: HELLO WORLD
        System.out.println("Lowercase: " + lowerCase); // Output: hello world

        // Splitting
        String fruits = "apple,orange,banana";
        String[] fruitArray = fruits.split(","); // Split based on commas
        System.out.println("Split fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // Trimming
        String paddedStr = "   Hello World   ";
        String trimmedStr = paddedStr.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'"); // Output: 'Hello World'

        // 3. Data Structure Operations with Strings

        // Using Arrays of Strings
        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("Array of Names:");
        for (String name : names) {
            System.out.println(name);
        }

        // Storing Strings in Collections
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");
        System.out.println("ArrayList of Names: " + nameList);

        // Using Strings in Maps
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 28);
        System.out.println("Age of Alice: " + ageMap.get("Alice")); // Output: 25

        // Summary
        System.out.println("This program demonstrates various String methods and their use in data structures.");
    }
}
