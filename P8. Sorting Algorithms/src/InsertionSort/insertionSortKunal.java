package InsertionSort;

import java.util.Arrays;

import static java.util.Collections.swap;

public class insertionSortKunal {
    public static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int next) {
        int temp = arr[first];
        arr[first] = arr[next];
        arr [next] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 1, 2};

        insertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
