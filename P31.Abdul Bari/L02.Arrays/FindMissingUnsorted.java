import java.util.Arrays;

public class FindMissingUnsorted {
    public static void findMissingEfficient(int[] arr, int n) {
        int[] hashArr = new int[n + 1]; // Create hash array of size (n+1)

        // Mark presence of elements in arr
        for (int num : arr) {
            if (num <= n) { // Ensure within range
                hashArr[num]++;
            }
        }

        // Find missing numbers
        for (int i = 1; i <= n; i++) { // Check from 1 to n
            if (hashArr[i] == 0) {
                System.out.println("Missing number: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 9, 12, 6, 1, 11, 2, 10}; // Given array
        int n = 12; // Expected range from 1 to 12
        findMissingEfficient(arr, n);
    }
}
