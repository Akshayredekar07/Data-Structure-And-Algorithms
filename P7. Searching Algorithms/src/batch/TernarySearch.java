package batch;

public class TernarySearch {
    
    public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int key = 5;
    int result = ternarySearch(key, arr);
    if(result != -1){
        System.out.println(key + " found at index " + result);
    } else {
        System.out.println(key + " not found in the array");
    }
    }


    public static int ternarySearch(int key, int arr[]) {
        int l = 0; // Initialize lower bound
        int h = arr.length - 1; // Initialize upper bound

        while (l <= h) {
            int mid1 = l + (h - l) / 3; // Calculate first midpoint
            int mid2 = h - (h - l) / 3; // Calculate second midpoint

            // Dry run example:
            // Let's say l = 0, h = 9 (for the array of size 10)
            // mid1 = 0 + (9 - 0) / 3 = 3
            // mid2 = 9 - (9 - 0) / 3 = 6
            // Now, arr[mid1] = arr[3] = 4 and arr[mid2] = arr[6] = 7

            if (arr[mid1] == key) {
                return mid1; // Key found at mid1
            } else if (arr[mid2] == key) {
                return mid2; // Key found at mid2
            } else if (key < arr[mid1]) {
                h = mid1 - 1; // Search in the left segment
            } else if (key > arr[mid2]) {
                l = mid2 + 1; // Search in the right segment
            } else {
                l = mid1 + 1; // Search in the middle segment
                h = mid2 - 1; // Adjust upper bound for middle segment
            }
        }

        return -1; // Key not found
    }


    public static int ternarySearchRecursive(int[] arr, int key, int l, int h) {
        if (h >= l) {
            int mid1 = l + (h - l) / 3; // Calculate first midpoint
            int mid2 = h - (h - l) / 3; // Calculate second midpoint

            if (arr[mid1] == key) {
                return mid1; // Key found at mid1
            } else if (arr[mid2] == key) {
                return mid2; // Key found at mid2
            } else if (key < arr[mid1]) {
                return ternarySearchRecursive(arr, key, l, mid1 - 1); // Search in the left segment
            } else if (key > arr[mid2]) {
                return ternarySearchRecursive(arr, key, mid2 + 1, h); // Search in the right segment
            } else {
                return ternarySearchRecursive(arr, key, mid1 + 1, mid2 - 1); // Search in the middle segment
            }
        }
        return -1; // Key not found
    }
}
