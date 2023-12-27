package Geeks.com;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 7, 30};
        int[] reversedArr = reverse(arr);
        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] reverse(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }
}

