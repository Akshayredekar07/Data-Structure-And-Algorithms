package MergeSort;

import java.util.Arrays;

public class mergeTwoSorted {
    public static void main(String[] args) {
        int[] a = {10,15, 20, 20};
        int[] b = {1, 12};
        printMergedArrays(a, b);

    }

    static void printMergedArrays(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length+i] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < (a.length + b.length); i++) {
            System.out.print(c[i]+" ");
        }
    }

    
}
