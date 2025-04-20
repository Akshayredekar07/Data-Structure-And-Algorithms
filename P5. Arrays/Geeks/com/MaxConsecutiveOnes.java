package Geeks.com;

public class MaxConsecutiveOnes {

    // O(n^2) solution
    public static int maxConsecutiveOnes(int[] arr) {
        int res = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 1) { // Check if the current element is 1
                    curr++;
                } else {
                    break; // Break on encountering a 0
                }
            }
            res = Math.max(res, curr); // Update maximum count of consecutive ones
        }

        return res;
    }

    // O(n) solution
    public static int maxConnectiveOnes(int[] arr) {
        int max = 0, curr = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) { // Check for 0
                curr = 0; // Reset the current count
            } else {
                curr++; // Increment count for 1
                max = Math.max(max, curr); // Update max if current count is greater
            }
        }
        return max; // Return the maximum count
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 1, 0, 1, 1, 1}; // Using int values
        System.out.println("Max Consecutive 1s (O(n^2)): " + maxConsecutiveOnes(arr1));

        int[] arr2 = {0, 1, 0, 1, 1, 1, 0, 1, 1}; // Another array
        int result = maxConnectiveOnes(arr2);
        System.out.println("The maximum number of consecutive ones (O(n)) is: " + result);
    }
}