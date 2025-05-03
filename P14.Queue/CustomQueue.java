public class CustomQueue {
    private int[] queue;
    private int front; // Index of the front element
    private int rear;  // Index of the last element
    private int size;  // Current number of elements
    private int capacity; // Maximum capacity of the queue

    // Constructor to initialize the queue with given capacity
    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Add an element to the rear of the queue
    public void enqueue(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    // Remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return element;
    }

    // View the front element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Return the current size of the queue
    public int size() {
        return size;
    }

    // Main method to demonstrate queue operations
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Display queue size
        System.out.println("Queue size: " + queue.size());

        // Peek at front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        // Display queue size after dequeue
        System.out.println("Queue size after dequeues: " + queue.size());

        // Peek at new front element
        System.out.println("New front element: " + queue.peek());

        // Enqueue another element
        queue.enqueue(6);

        // Check if queue is full
        System.out.println("Is queue full? " + queue.isFull());

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}