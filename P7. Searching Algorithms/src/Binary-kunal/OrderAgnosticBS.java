public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 3, 4, 5, 7, 9, 11, 14, 18, 21};
        int target = 1;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);


        int[] arr1 = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target1 = -77;
        int ans1 = orderAgnosticBS(arr1, target1);
        System.out.println(ans1);
    }


    // Main Logic of the program
    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // Find array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end]; 

        while(start <= end){
             int mid = start + (end - start)/2;

             if (arr[mid] == target){
                return mid;
             }

             if(isAsc){
                if (target < arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
             }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
             }
        }
        return -1;
    }
}

