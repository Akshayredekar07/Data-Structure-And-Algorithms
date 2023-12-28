package selectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionKunal {

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 8, 4, 1};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            /* Find the max item in the remaining array
            and swap with the correct index */
            int last = arr.length-i-1;
            int maxIndex =getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int next) {
        int temp = arr[first];
        arr[first] = arr[next];
        arr [next] = temp;
    }

}
