package batch;

public class RecursiveBinarySearch {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int x = 20;
        int low = 0;
        int high = arr.length;
        int res = recursiveBinarySearch(arr, low, high, x);
        if (res != -1) {
            System.out.println(x + " present at index " + res);
        } else {
            System.out.println(x + " is not present");
        }
        
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
}


/*

recursiveBinarySearch(arr, 0, 6, 20)
    |
    +-- recursiveBinarySearch(arr, 0, 2, 20)
          |
          +-- return 1
 */