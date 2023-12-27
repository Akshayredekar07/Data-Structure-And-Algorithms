package Geeks.com;

import java.util.ArrayList;

public class DynamicArrayInsertionExample {

    public static void main(String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<>(); // Create a dynamic array

        // Initial array elements
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);

        System.out.println("Original Array:");
        for (int num : dynamicArray) {
            System.out.print(num + " ");
        }

        int key = 25; // Element to be inserted
        int position = 3; // Position where the element should be inserted

        dynamicArray.add(position - 1, key); // Insert element at specified position

        System.out.println("\nArray after insertion:");
        for (int num : dynamicArray) {
            System.out.print(num + " ");
        }
    }
}
