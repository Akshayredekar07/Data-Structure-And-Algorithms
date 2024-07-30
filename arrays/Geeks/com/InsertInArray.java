package Geeks.com;

class InsertInArray {
    // Method to insert an element into the array
    static int insert(int array[], int currentSize, int elementToInsert, int capacity, int position) {
        // If the array is full, return the current size
        if (currentSize == capacity)
            return currentSize;

        // Calculate the index for insertion (0-based)
        int index = position - 1;

        // Shift elements to the right to create space for the new element
        for (int i = currentSize - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        // Insert the new element at the specified position
        array[index] = elementToInsert;

        // Return the new size of the array
        return currentSize + 1;
    }

    public static void main(String args[]) {
        // Initialize an array with capacity 5
        int array[] = new int[5];
        int capacity = 5;
        int currentSize = 3;

        // Set the initial elements of the array
        array[0] = 3;
        array[1] = 8;
        array[2] = 12;

        // Print the array before insertion
        System.out.println("Before Insertion:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Element to insert and position
        int elementToInsert = 10;
        int position = 2;

        // Insert the element and update the size
        currentSize = insert(array, currentSize, elementToInsert, capacity, position);

        // Print the array after insertion
        System.out.println("After Insertion:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
