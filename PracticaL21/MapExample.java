package PracticaL21;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        // 1. Implementing Map using HashMap (Unordered)
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(103, "Charlie");
        hashMap.put(101, "Alice");
        hashMap.put(102, "Bob");

        System.out.println("HashMap (Unordered): " + hashMap);

        // 2. Implementing Map using LinkedHashMap (Maintains Insertion Order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(103, "Charlie");
        linkedHashMap.put(101, "Alice");
        linkedHashMap.put(102, "Bob");

        System.out.println("LinkedHashMap (Maintains Order): " + linkedHashMap);

        // Accessing value by key
        System.out.println("Value for key 101: " + hashMap.get(101));

        // Checking if key exists
        System.out.println("Contains key 102? " + hashMap.containsKey(102));

        // Removing an entry
        hashMap.remove(103);
        linkedHashMap.remove(103);

        System.out.println("HashMap after removal: " + hashMap);
        System.out.println("LinkedHashMap after removal: " + linkedHashMap);
    }
}
