package Geeks.com;

class CheckSorted {

    // First approach: Nested loops for all pairs
    static boolean isSortedUsingAllPairs(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    // Second approach: Single loop for consecutive elements
    static boolean isSortedUsingConsecutiveElements(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 5;

        System.out.println("Using all pairs: " + isSortedUsingAllPairs(arr, n));
        System.out.println("Using consecutive elements: " + isSortedUsingConsecutiveElements(arr, n));
    }
}
