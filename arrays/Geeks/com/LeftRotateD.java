package Geeks.com;

public class LeftRotateD {
    public static void main(String[] args) {

    }

    public static void LeftRotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    //Second time calling left rotate by one
    public static void LeftRotate1(int[] arr){
        int n = arr.length;
        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }

    //efficient solution
    public static void leftR(int[] arr, int d){
        int n = arr.length;
        int temp;


    }
}
