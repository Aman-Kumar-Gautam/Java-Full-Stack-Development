
// ArrayList Example:
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        
        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
        // Accessing elements
        System.out.println("Element at index 1: " + arrayList.get(1)); // Output: Banana
        
        // Iterating over the list
        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        
        // Removing an element
        arrayList.remove("Banana");
        System.out.println("After removing 'Banana': " + arrayList);
        
        // Checking if the list contains an element
        System.out.println("Contains 'Apple'? " + arrayList.contains("Apple"));
    }
}
