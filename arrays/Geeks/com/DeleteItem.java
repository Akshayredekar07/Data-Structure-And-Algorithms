package Geeks.com;

public class DeleteItem {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50}; // Initial array
        int size = 5; // Initial size of the array

        int elementToDelete = 30; // Element to be deleted

        System.out.println("Original Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        size = delete(array, size, elementToDelete);

        System.out.println("\nArray after deletion:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int delete(int[] arr, int n, int x){
        int i;
        for(i=0; i < n; i++) {
            if (arr[i] == x) {
                break;
            }
        }
        if (i == n){
            return n;
        }

        for(int j=0; j<n-1; j++){
            arr[i] = arr[j+1];
        }

        return (n-1);

    }
}
