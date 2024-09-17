package CycleSort;

import java.util.Arrays;

public class DistinctCycleSort {
    public static void distinctSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int item = arr[i];
            int pos = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < item) {
                    pos++;
                }
            }
            swap(arr, i, pos); // Changed 'item' to 'i' and 'arr[pos]' to 'pos'
            while (pos != i) {
                pos = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < item) {
                        pos++;
                    }
                }
                swap(arr, i, pos); // Changed 'item' to 'i' and 'arr[pos]' to 'pos'
            }
        }
    }

    private static void swap(int[] arr, int i, int j) { // Corrected the swap method parameters
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {20, 40, 50, 10, 30};
        distinctSort(nums);
        System.out.print(Arrays.toString(nums));
    }
}
