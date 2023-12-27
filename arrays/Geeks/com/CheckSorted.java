package Geeks.com;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {7,20, 30, 10};
        System.out.println(isSorted(arr));
        System.out.println(efficientApproach(arr));
    }

    public static boolean isSorted(int[] arr){
        for (int j : arr) {
            for (int k : arr) {
                if (k < j) {
                    return false;
                }
            }
        }
        /*
        for(int i=0; i<arr.length; i++){
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }*/
        return true;
    }

    public static boolean efficientApproach(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
