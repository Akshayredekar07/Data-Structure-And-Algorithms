package selectionSort;

import java.util.Arrays;

public class selection {
    /**
     * pick the smallest from unsorted and put it at the beginning
     */
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minVal = i;
            for (int j = i+1; j <= arr.length-1; j++) {
                if(arr[minVal] > arr[j]){
                    minVal = j;
                }
            }
            //swap elements
            int temp = arr[minVal];
            arr[minVal] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        selectionSort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
