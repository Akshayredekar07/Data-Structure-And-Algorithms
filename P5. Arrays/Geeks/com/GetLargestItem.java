package Geeks.com;

public class GetLargestItem {

    public static void main(String[] args) {
        int[] arr = {23, 46,78,9,65,33};
        System.out.println(largest(arr));;
        System.out.println(getLargest(arr));
    }

    public static  int largest(int[]arr){
        /* O(n*2) */
        for(int i = 0; i < arr.length; i++){
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return i;
            }
        }
        return -1;
    }

    //efficient solution
    public static int getLargest(int[] arr){
        int res = 0;
        for (int j : arr) {
            if (j > arr[res]) {
                res = 1;
                break;
            }
        }
        return res;
    }

}
