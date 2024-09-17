package Geeks.com;

public class OperationPart1 {
    public static void main(String[] args) {
        int[] arr = {20, 7, 5, 25, 34, 21, 41};
//        int key  = 41;

        int[] array = new int[10]; // Example array with a capacity of 10
        int size = 5; // Initial size of the array
        int capacity = 10; // Maximum capacity of the array

        // Initial array elements
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        int key = 25; // Element to be inserted
        int position = 3; // Position where the element should be inserted

        size = insert(array, size, key, position, capacity);

        System.out.println("\nArray after insertion:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }

//    public static int search(int[] arr, int key){
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] == key){
//                return 1;
//            }
//        }
//        return -1;
//    }

    public static int insert(int[]arr, int n, int key, int pos, int cap) {
        // O(n) time
        if (n == cap) {
            return n;
        }
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid position for insertion.");
            return n;
        }
        int index = pos-1;
        for(int i = n-1; i>=index; i--){
            arr[index] = key;
        }
        arr[index] = key;
        return (n+1);
    }
}
