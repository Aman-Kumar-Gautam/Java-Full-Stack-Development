// TreeSet Example:
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        
        // Adding elements
        treeSet.add("Dog");
        treeSet.add("Cat");
        treeSet.add("Bird");
        treeSet.add("Dog"); // Duplicate element, will not be added
        
        // Accessing elements
        System.out.println("TreeSet elements: " + treeSet);
        
        // Checking if the set contains an element
        System.out.println("Contains 'Cat'? " + treeSet.contains("Cat"));
        
        // Removing an element
        treeSet.remove("Cat");
        System.out.println("After removing 'Cat': " + treeSet);
        
        // Iterating over the set
        System.out.println("Iterating over TreeSet:");
        for (String animal : treeSet) {
            System.out.println(animal);
        }
    }
}