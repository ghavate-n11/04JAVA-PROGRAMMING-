package PracticaL19;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        // Implementing Set using HashSet (Unordered, no duplicates)
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");
        hashSet.add("Apple"); // Duplicate element (will be ignored)

        System.out.println("HashSet (Unordered): " + hashSet);

        // Implementing Set using TreeSet (Sorted order, no duplicates)
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Orange");

        System.out.println("TreeSet (Sorted): " + treeSet);

        // Checking if an element exists
        System.out.println("Does HashSet contain 'Mango'? " + hashSet.contains("Mango"));

        // Removing an element
        hashSet.remove("Banana");
        treeSet.remove("Apple");

        System.out.println("HashSet after removal: " + hashSet);
        System.out.println("TreeSet after removal: " + treeSet);
    }
}
