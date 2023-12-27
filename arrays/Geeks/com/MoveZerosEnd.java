package Geeks.com;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int arr[] = {8, 5, 0, 10, 0, 20};
        moveZero(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void movesZeros(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                for (int j = i+1; j < n; j++) {
                    if(arr[i] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }

    public static void moveZero(int arr[]){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                swap(arr, i, count);
                count++;
            }
        }
    }

    public static void swap(int arr[], int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
