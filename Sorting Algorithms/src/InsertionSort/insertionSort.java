package InsertionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
    int[] arr = {5, 4, 1, 3, 2};
    insertionSort(arr);
    System.out.print(Arrays.toString(arr));
    System.out.println();
    insertionSortDescending(arr);
    System.out.print(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void insertionSortDescending(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //Finding out the correct position to insert
            while (prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }
}

