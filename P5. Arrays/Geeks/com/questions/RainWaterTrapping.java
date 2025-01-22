package Geeks.com.questions;

public class RainWaterTrapping {
    // Naive approach to calculate trapped water
    public static int getWaterNaive(int[] arr) {
        int n = arr.length;
        int res = 0;

        // Calculate trapped water for each bar
        for (int i = 1; i < n - 1; i++) {
            int lMax = arr[i];
            for (int j = 0; j < i; j++) {
                lMax = Math.max(lMax, arr[j]); // Find max to the left
            }

            int rMax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rMax = Math.max(rMax, arr[j]); // Find max to the right
            }

            res += (Math.min(lMax, rMax) - arr[i]); // Calculate trapped water
        }
        return res;
    }

    // Optimized approach to calculate trapped water
    public static int getWaterOptimized(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0; // No water can be trapped if less than 3 elements

        int res = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        // Calculate left maximums
        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(arr[i], lMax[i - 1]);
        }

        // Calculate right maximums
        rMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(arr[i], rMax[i + 1]);
        }

        // Calculate trapped water
        for (int i = 1; i < n - 1; i++) {
            res += (Math.min(lMax[i], rMax[i]) - arr[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.println("Trapped Water (Naive): " + getWaterNaive(arr));
        System.out.println("Trapped Water (Optimized): " + getWaterOptimized(arr));
    }
}
