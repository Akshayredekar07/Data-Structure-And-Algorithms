// Array class in Java
class Array {
    private int[] A;  // Array to hold elements
    private int length; // Current number of elements in the array

    // Constructor to initialize the array
    public Array(int[] elements, int size, int length) {
        this.A = new int[size]; // Allocate memory for the array
        System.arraycopy(elements, 0, this.A, 0, length); // Copy elements
    }

    // Display the elements of the array
    public void display() {
        System.out.print("Elements are: ");
        for (int i = 0; i < length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    // Get the element at a given index
    public int get(int index) {
        if (index >= 0 && index < length) {
            return A[index];
        }
        return -1; // Return -1 for invalid index
    }

    // Set a value at a given index
    public void set(int index, int value) {
        if (index >= 0 && index < length) {
            A[index] = value;
        }
    }

    // Find the maximum element in the array
    public int max() {
        int max = A[0];
        for (int i = 1; i < length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    // Find the minimum element in the array
    public int min() {
        int min = A[0];
        for (int i = 1; i < length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    // Calculate the sum of all elements in the array
    public int sum() {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += A[i];
        }
        return sum;
    }

    // Calculate the average of the elements in the array
    public float avg() {
        return (float) sum() / length;
    }

    // Swap two elements in the array
    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < length && index2 >= 0 && index2 < length) {
            int temp = A[index1];
            A[index1] = A[index2];
            A[index2] = temp;
        }
    }
}

// Main class to test the Array class
public class Main {
    public static void main(String[] args) {
        // Initialize the array with elements
        int[] elements = {2, 3, 9, 16, 18, 21, 28, 32, 35};
        Array arr = new Array(elements, 10, 9);
        System.out.println("Sum: " + arr.sum());

        // Display the elements of the array
        arr.display();

        // Example usage of other methods
        System.out.println("Element at index 2: " + arr.get(2));

        arr.set(2, 100);
        System.out.println("Updated element at index 2: " + arr.get(2));

        System.out.println("Maximum element: " + arr.max());
        System.out.println("Minimum element: " + arr.min());
        System.out.println("Average: " + arr.avg());

        // Swap two elements
        arr.swap(2, 4);
        System.out.println("Array after swapping elements at index 2 and 4:");
        arr.display();
    }
}
