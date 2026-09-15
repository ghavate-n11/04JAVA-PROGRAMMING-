package PracticaL18;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

       
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");

        System.out.println("LinkedList: " + linkedList);//

    }
}

