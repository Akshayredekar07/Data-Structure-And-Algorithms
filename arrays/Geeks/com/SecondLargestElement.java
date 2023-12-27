package Geeks.com;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr= {12, 15, 2, 19, 5};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr){
        int largest = getLargest(arr);
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr[largest]){
                if(res == -1){
                    res = i;
                }else if(arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    public static int getLargest(int[] arr){
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[res]){
                res = 1;
            }
        }
        return res;
    }
}
