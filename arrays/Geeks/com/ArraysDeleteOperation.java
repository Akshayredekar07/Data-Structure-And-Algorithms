package Geeks.com;

public class ArraysDeleteOperation {
    public static void main(String[] args) {
        int [] arr = {3,5,12,5,6};
        int delItem = 12;
        System.out.println(DeleteElement(arr, delItem));

    }

    public static int DeleteElement(int[] arr, int x){
        int n = arr.length;
        int i = 0;
        for (int k : arr) {
            if (k == x) {
                break;
            }
        } //take O(n)
        if(i == n){
            return n;
        }

        for (int j = i; j < n-1; j++) {
            arr[j] = arr[j+1];
        }//take O(n)
        return (n-1); //Return length
        //O(n) + O(n)

    }
}
