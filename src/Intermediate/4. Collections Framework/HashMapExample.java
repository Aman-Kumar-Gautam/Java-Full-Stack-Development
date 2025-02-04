// HashMap Example
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Accessing values
        System.out.println("Value for key 'Two': " + hashMap.get("Two")); // Output: 2
        
        // Iterating over the map
        System.out.println("HashMap elements:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Checking if the map contains a key
        System.out.println("Contains key 'Three'? " + hashMap.containsKey("Three"));
        
        // Removing a key-value pair
        hashMap.remove("Two");
        System.out.println("After removing key 'Two': " + hashMap);
    }
}
