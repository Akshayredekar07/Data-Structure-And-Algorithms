package batch;

public class FirstOccurance {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int x = 2;
        System.out.println(firstOccurance1(arr, 0, arr.length - 1, x));
    }

    public static int firstOccurance(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Optimized
    public static int firstOccurance1(int[] arr, int low ,int high, int x){
        if(low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if (arr[mid] < x) {
            return firstOccurance1(arr, mid + 1, high, x);
        } else if (arr[mid] > x) { 
            return firstOccurance1(arr, low, mid - 1, x);
        }else{
            if(arr[mid]==0 || arr[mid-1] != arr[mid]){
                return mid;
            }else{
                return firstOccurance1(arr, low, mid-1, x);
            }
        }
    }

}
