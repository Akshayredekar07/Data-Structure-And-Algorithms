package batch;

public class FirstOccuranceIterative {
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x = 2;
        System.out.println(firstOccuranceIterative(arr,  x));
    }

    public static int firstOccuranceIterative(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;

        while (low<=high) {
            
            int mid = (low+high)/2;

            if(arr[mid]>x){
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                if(arr[mid]==0 || arr[mid-1] != arr[mid]){
                    return mid;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}
