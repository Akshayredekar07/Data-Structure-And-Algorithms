package batch;

public class CountOccurances {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 30, 30};
        int x = 20; 
        int count = countOccurances(arr, x);
        System.out.println("Count of " + x + ": " + count);
    }

    public static int countOccurances(int arr[], int x) {
        int first = firstOccuranceIterative(arr, x);
        if (first == -1) {
            return 0;
        } else {
            return (lastOcc(arr, x) - first + 1); 
        }
    }

    public static int firstOccuranceIterative(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == 0 || arr[mid - 1] != arr[mid]) { 
                    return mid;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    static int lastOcc(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                high = mid - 1;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                if (mid == arr.length - 1 || arr[mid + 1] != arr[mid]) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
