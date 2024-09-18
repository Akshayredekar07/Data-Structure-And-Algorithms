package batch;

public class LastOccuarnceIterative {
    public static void main(String[] args) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20};
        int x = 10;
        System.out.println(lastOcc(arr, x));
    }

    static int lastOcc(int arr[], int x){
        int low = 0, high = arr.length - 1; 
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x){
                high = mid - 1;
            }
            else if(arr[mid] < x){
                low = mid + 1;
            }
            else{
                if(mid == arr.length - 1 || arr[mid + 1] != arr[mid]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
        }   
        return -1;
    }
}
