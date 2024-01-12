package MergeSort;

import java.util.Arrays;

public class mergeTwoSorted {
    public static void main(String[] args) {
        int[] a = {10,15, 20, 20};
        int[] b = {1, 12};
        printMergedArrays(a, b);

    }

    //Naive approach
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

    //efficient approach
    public static void merge(int[]a, int[]b){
        int i = 0, j = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                System.out.print(a[i] + " ");
                i++;
            }else{
                System.out.print(b[j] + " ");
                j++;
            }
        }
        while (i < a.length){
            System.out.print(a[i] + " ");
            i++;
        }
        while (j < b.length){
            System.out.print(b[j] + " ");
            j++;
        }
    }

    
}
