import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Using an ArrayList
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");
        System.out.println("List: " + list);

        // Using a HashSet
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate element
        System.out.println("Set: " + set);

        // Using a HashMap
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        System.out.println("Map: " + map);

        // Using a PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(15);
        System.out.println("Queue: " + queue);

        // Iterating over a List
        System.out.println("Iterating over a List:");
        for (String name : list) {
            System.out.println("Name: " + name);
        }

        // Iterating over a Set
        System.out.println("Iterating over a Set:");
        for (String fruit : set) {
            System.out.println("Fruit: " + fruit);
        }

        // Iterating over a Map
        System.out.println("Iterating over a Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Processing a Queue
        System.out.println("Processing a Queue:");
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}
