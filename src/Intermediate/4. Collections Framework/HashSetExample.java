// HashSet Example:
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        
        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple"); // Duplicate element, will not be added
        
        // Accessing elements
        System.out.println("HashSet elements: " + hashSet);
        
        // Checking if the set contains an element
        System.out.println("Contains 'Banana'? " + hashSet.contains("Banana"));
        
        // Removing an element
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);
        
        // Iterating over the set
        System.out.println("Iterating over HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}