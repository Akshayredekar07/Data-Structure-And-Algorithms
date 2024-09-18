package batch;

public class LastOccuarnceRecursive {
    public static void main(String args[]) {
        int arr[] = {5, 10, 10, 10, 10, 20, 20}, n = arr.length;
        int x = 10;
        System.out.println(lastOcc(arr, 0, n - 1, x, n));
    } 

    static int lastOcc(int arr[], int low, int high, int x, int n){
		if(low > high)
			return -1;
		int mid = (low + high) / 2;
		if(x > arr[mid])
			return lastOcc(arr, mid + 1, high, x, n);
		else if(x < arr[mid])
			return lastOcc(arr, low, mid - 1, x, n);
		else{
			if(mid == n - 1 || arr[mid + 1] != arr[mid])
				return mid;
			else
				return lastOcc(arr, mid + 1, high, x, n);
		}
	}

}
