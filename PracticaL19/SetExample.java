package PracticaL19;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
//
public class SetExample {
    public static void main(String[] args) {

        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Mango");
        hashSet.add("Apple"); // Duplicate element (will be ignored)

        System.out.println("HashSet (Unordered): " + hashSet);

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Orange");

        System.out.println("TreeSet (Sorted): " + treeSet);

        
    }
}
