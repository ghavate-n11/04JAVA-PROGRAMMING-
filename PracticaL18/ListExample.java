package PracticaL18;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        // Implementing List using ArrayList
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        System.out.println("ArrayList: " + arrayList);

        // Implementing List using LinkedList
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");

        System.out.println("LinkedList: " + linkedList);

        // Accessing elements
        System.out.println("First element of ArrayList: " + arrayList.get(0));
        System.out.println("First element of LinkedList: " + linkedList.get(0));

        // Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Green");

        System.out.println("ArrayList after removal: " + arrayList);
        System.out.println("LinkedList after removal: " + linkedList);
    }
}

