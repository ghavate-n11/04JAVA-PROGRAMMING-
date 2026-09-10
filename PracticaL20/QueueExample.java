package PracticaL20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        // 1. Implementing Queue using PriorityQueue
        // Elements are ordered based on priority (natural ascending order)
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(40);
        priorityQueue.add(10);
        priorityQueue.add(30);
        priorityQueue.add(20);

        System.out.println("PriorityQueue: " + priorityQueue);

        // Accessing and removing head element
        System.out.println("Head element (peek): " + priorityQueue.peek());
        System.out.println("Removed element (poll): " + priorityQueue.poll()); // Removes 10 (highest priority/smallest)
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        System.out.println();

        // 2. Implementing Deque (Double Ended Queue) using ArrayDeque
        // Allows insertion and removal from both ends (front and rear)
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to both ends
        deque.add("Middle");
        deque.addFirst("Front");
        deque.addLast("Rear");

        System.out.println("Deque: " + deque);

        // Accessing elements from both ends
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // Removing elements from both ends
        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removal: " + deque);
    }
}
