import java.util.HashSet;

class Day03_checkDuplicatesWithinK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        int k = 3;
        Day03_checkDuplicatesWithinK solution = new Day03_checkDuplicatesWithinK();
        boolean result = solution.checkDuplicatesWithinK(arr, k);
        System.out.println("Contains duplicates within k: " + result);
    }

    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // Check if the current element is already in the set
            if (set.contains(arr[i])) {
                return true;
            }
            // Add the current element to the set
            set.add(arr[i]);

            // Maintain the set size to be at most k
            if (i >= k) {
                set.remove(arr[i - k]);
            }
        }
        return false;
    }
}
