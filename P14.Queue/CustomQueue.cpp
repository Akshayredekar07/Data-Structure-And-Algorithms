
#include <iostream>
#include <stdexcept>

using namespace std;

class CustomQueue {
private:
    int* queue;       // Dynamic array to store queue elements
    int front;        // Index of the front element
    int rear;         // Index of the last element
    int size;         // Current number of elements
    int capacity;     // Maximum capacity of the queue

public:
    // Constructor to initialize the queue with given capacity
    CustomQueue(int capacity) {
        this->capacity = capacity;
        this->queue = new int[capacity];
        this->front = 0;
        this->rear = -1;
        this->size = 0;
    }

    // Destructor to free allocated memory
    ~CustomQueue() {
        delete[] queue;
    }

    // Add an element to the rear of the queue
    void enqueue(int element) {
        if (isFull()) {
            throw overflow_error("Queue is full");
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = element;
        size++;
        cout << "Enqueued: " << element << endl;
    }

    // Remove and return the front element of the queue
    int dequeue() {
        if (isEmpty()) {
            throw underflow_error("Queue is empty");
        }
        int element = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return element;
    }

    // View the front element without removing it
    int peek() const {
        if (isEmpty()) {
            throw underflow_error("Queue is empty");
        }
        return queue[front];
    }

    // Check if the queue is empty
    bool isEmpty() const {
        return size == 0;
    }

    // Check if the queue is full
    bool isFull() const {
        return size == capacity;
    }

    // Return the current size of the queue
    int getSize() const {
        return size;
    }
};

int main() {
    try {
        // Create a queue with capacity 5
        CustomQueue queue(5);

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Display queue size
        cout << "Queue size: " << queue.getSize() << endl;

        // Peek at front element
        cout << "Front element: " << queue.peek() << endl;

        // Dequeue elements
        cout << "Dequeued: " << queue.dequeue() << endl;
        cout << "Dequeued: " << queue.dequeue() << endl;

        // Display queue size after dequeue
        cout << "Queue size after dequeues: " << queue.getSize() << endl;

        // Peek at new front element
        cout << "New front element: " << queue.peek() << endl;

        // Enqueue another element
        queue.enqueue(6);

        // Check if queue is full
        cout << "Is queue full? " << (queue.isFull() ? "Yes" : "No") << endl;

        // Check if queue is empty
        cout << "Is queue empty? " << (queue.isEmpty() ? "Yes" : "No") << endl;
    }
    catch (const exception& e) {
        cerr << "Error: " << e.what() << endl;
    }

    return 0;
}