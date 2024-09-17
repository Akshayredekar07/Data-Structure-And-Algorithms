package CycleSort;

import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
    int [] arr = {3,5, 2, 1, 4};
    sort(arr);
    System.out.print(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i=0;
        while (i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr [i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }else {
                i++;
            }
        }
    }
}
