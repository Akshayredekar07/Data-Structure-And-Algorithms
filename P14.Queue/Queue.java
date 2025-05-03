
import java.util.LinkedList;
import java.util.Queue;

public class Queue{
    public static void main(String[] args) {
        // Create a Queue using LinkedList implementation
        Queue<Integer> q = new LinkedList<>();

        // Add elements {0, 1, 2, 3, 4} to the queue
        for (int i = 0; i < 5; i++) {
            q.add(i);
        }

        // Display contents of the queue
        System.out.println("Elements of queue: " + q);

        // Remove and return the head of the queue
        int removedElement = q.remove();
        System.out.println("Removed element: " + removedElement);

        // Display queue after removal
        System.out.println("Queue after removal: " + q);

        // View the head of the queue without removing it
        int head = q.peek();
        System.out.println("Head of queue: " + head);

        // Display the size of the queue
        int size = q.size();
        System.out.println("Size of queue: " + size);

        // Demonstrate additional Queue operations
        System.out.println("Is queue empty? " + q.isEmpty());
        System.out.println("Does queue contain 2? " + q.contains(2));
    }
}