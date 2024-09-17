package Geeks.com.questions;

public class FrequenciesOfSorted {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 30, 30, 40};
        int[] arr1 = {40, 50, 50, 50};

        printFrequencies(arr);
//        printFrequencies(arr1);
    }

    public static void printFrequencies(int[] arr){
        int n = arr.length;
        int i = 1;
        int fre = 1;

        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                fre++;
                i++;
            }
            System.out.println(arr[i - 1] + " : " + fre);
            i++;
            fre = 1;
        }

        // Handle the last element if it's not already printed
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[n - 1] + " : 1");
        }
    }
}
