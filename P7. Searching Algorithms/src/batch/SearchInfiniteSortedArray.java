package batch;

public class SearchInfiniteSortedArray {
    public static int searchInfiniteSortedArray(int[] arr, int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x) {
                return i;
            }
            if (arr[i] > x) {
                return -1;
            }
            i++; 
        }
    }

    public static int efficientApproach(int[] arr, int x){
        if(arr[0] == x) return 0;
		int i = 1;
		while(arr[i] < x)
			i = i * 2;
		if(arr[i] == x) return i;

		return recursiveBinarySearch(arr, i / 2 + 1, i - 1, x);
    }

    static int recursiveBinarySearch(int[] arr, int low, int high, int x) {

        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return recursiveBinarySearch(arr, low, mid - 1, x);
        } else {
            return recursiveBinarySearch(arr, mid + 1, high, x);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int x = 20;
        int res = efficientApproach(arr, x);
        if (res != -1) {
            System.out.println(x + " present at index " + res);
        } else {
            System.out.println(x + " is not present");
        }
    }
}
