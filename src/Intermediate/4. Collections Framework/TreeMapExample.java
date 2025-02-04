// TreeMap Example
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        
        // Adding key-value pairs
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        
        // Accessing values
        System.out.println("Value for key 'Two': " + treeMap.get("Two")); // Output: 2
        
        // Iterating over the map
        System.out.println("TreeMap elements:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Checking if the map contains a key
        System.out.println("Contains key 'Three'? " + treeMap.containsKey("Three"));
        
        // Removing a key-value pair
        treeMap.remove("Two");
        System.out.println("After removing key 'Two': " + treeMap);
    }
}