package Geeks.com;

public class LeftRotateByOne {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        LeftRotate(arr);

        for (int i = 0; i < arr.length; i++) // Change the loop start index to 0
            System.out.print(arr[i] + " "); // Print each element individually
    }

    public static void LeftRotate(int arr[]){
        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
}
