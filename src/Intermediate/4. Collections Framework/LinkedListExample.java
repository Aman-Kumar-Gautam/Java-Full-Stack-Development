import java.util.LinkedList;
import java.util.List;
// LinkedList Example:


public class LinkedListExample {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        
        // Adding elements
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Bird");
        
        // Accessing elements
        System.out.println("Element at index 1: " + linkedList.get(1)); // Output: Cat
        
        // Iterating over the list
        System.out.println("LinkedList elements:");
        for (String animal : linkedList) {
            System.out.println(animal);
        }
        
        // Removing an element
        linkedList.remove("Cat");
        System.out.println("After removing 'Cat': " + linkedList);
        
        // Checking if the list contains an element
        System.out.println("Contains 'Dog'? " + linkedList.contains("Dog"));
    }
}
