
import java.util.Arrays;

public class UnionSortedArrays {
    // Naive Solution: Merge arrays, sort, and remove duplicates
    static void unionNaive(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        // Copy elements of a to c
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        // Copy elements of b to c
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        // Sort the merged array
        Arrays.sort(c);
        // Print distinct elements
        for (int i = 0; i < c.length; i++) {
            if (i == 0 || c[i] != c[i - 1]) {
                System.out.print(c[i] + " ");
            }
        }
    }

    // Efficient Solution: Use two pointers to merge distinct elements
    static void unionEfficient(int[] a, int[] b) {
        int i = 0, j = 0;
        // Traverse both arrays using two pointers
        while (i < a.length && j < b.length) {
            // Skip duplicates in a
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            // Skip duplicates in b
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            // Compare elements and print the smaller one (or both if equal)
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else { // a[i] == b[j]
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        // Print remaining elements in a, skipping duplicates
        while (i < a.length) {
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
            i++;
        }
        // Print remaining elements in b, skipping duplicates
        while (j < b.length) {
            if (j == 0 || b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 20};
        int[] b = {5, 20, 40, 40};
        System.out.println("Naive Approach Output:");
        unionNaive(a, b);
        System.out.println("\nEfficient Approach Output:");
        unionEfficient(a, b);
        System.out.println();
    }

    /*
    Structured Dry Run for Naive Approach (unionNaive)
    a = [10, 20, 20], b = [5, 20, 40, 40]

    Step 1: Merge arrays into c
      - c = [10, 20, 20, 5, 20, 40, 40]

    Step 2: Sort c
      - c = [5, 10, 20, 20, 20, 40, 40]

    Step 3: Print distinct elements
      - i = 0: c[0] = 5, print 5
      - i = 1: c[1] = 10, 10 != 5, print 10
      - i = 2: c[2] = 20, 20 != 10, print 20
      - i = 3: c[3] = 20, 20 == 20, skip
      - i = 4: c[4] = 20, 20 == 20, skip
      - i = 5: c[5] = 40, 40 != 20, print 40
      - i = 6: c[6] = 40, 40 == 40, skip

    Output: 5 10 20 40

    Structured Dry Run for Efficient Approach (unionEfficient)
    a = [10, 20, 20], b = [5, 20, 40, 40]

    Initial: i = 0, j = 0

    Step 1: i = 0, j = 0
      - a[0] = 10, b[0] = 5
      - 10 > 5, print 5, j++ → j = 1

    Step 2: i = 0, j = 1
      - a[0] = 10, b[1] = 20
      - 10 < 20, print 10, i++ → i = 1

    Step 3: i = 1, j = 1
      - a[1] = 20, b[1] = 20
      - 20 == 20, print 20, i++ → i = 2, j++ → j = 2

    Step 4: i = 2, j = 2
      - a[2] = 20, a[2] == a[1], skip (duplicate), i++ → i = 3 (i >= a.length)

    Step 5: i >= a.length, j = 2
      - b[2] = 40, j == 0 || 40 != b[1], print 40, j++ → j = 3
      - b[3] = 40, 40 == b[2], skip (duplicate), j++ → j = 4 (j >= b.length)

    Loop ends (both i and j reached end)

    Output: 5 10 20 40

    Analysis for Naive Approach (unionNaive)
    Time Complexity:
    - Worst/Avg: O((m+n)*log(m+n)), merging takes O(m+n), sorting takes O((m+n)*log(m+n)), printing takes O(m+n).
    - Best: O((m+n)*log(m+n)), sorting dominates even if arrays are already sorted.
    Space Complexity: O(m+n), uses extra array c of size m+n for merging.
    Stability: Yes, processes arrays in sorted order, preserving relative order of distinct elements in output.
    Why Stable: Sorting ensures distinct elements are printed in ascending order, maintaining consistency (e.g., [5a, 5b] ∪ [5c, 5d] → 5).

    Analysis for Efficient Approach (unionEfficient)
    Time Complexity:
    - Worst/Avg: O(m+n), single while loop, each element in a and b visited at most once.
    - Best: O(m+n), no improvement as all elements must be processed to ensure union.
    Space Complexity: O(1), in-place, uses only i, j, and no extra space beyond output.
    Stability: Yes, processes arrays in order, preserving relative order of distinct elements in output.
    Why Stable: Two-pointer approach merges elements in sorted order, skips duplicates, prints in ascending order (e.g., [5a, 5b] ∪ [5c, 5d] → 5).
    */
}



// ### Output
// ```
// Naive Approach Output:
// 5 10 20 40 
// Efficient Approach Output:
// 5 10 20 40 
// ```

// ### Commands to Compile and Run the Java Code
// 1. **Compile**:
//    ```
//    javac UnionSortedArrays.java
//    ```
//    - This compiles the `UnionSortedArrays.java` file into `UnionSortedArrays.class`.

// 2. **Run**:
//    ```
//    java UnionSortedArrays
//    ```
//    - This executes the program, producing the output shown above.

// ### Explanation of the Code
// - **Naive Approach (`unionNaive`)**:
//   - Merges the two arrays into a single array `c` of size `m+n`.
//   - Sorts the merged array using `Arrays.sort` (which uses a modified Quick Sort, typically O((m+n)*log(m+n))).
//   - Prints distinct elements by skipping duplicates (`c[i] != c[i-1]`).
//   - Time complexity is dominated by sorting: O((m+n)*log(m+n)).
//   - Space complexity is O(m+n) due to the extra array `c`.
// - **Efficient Approach (`unionEfficient`)**:
//   - Uses two pointers (`i` for `a`, `j` for `b`) to traverse both arrays simultaneously.
//   - Skips duplicates in both arrays to ensure distinct output.
//   - Compares elements: prints the smaller one (or both if equal), advancing the respective pointer.
//   - After the main loop, prints any remaining elements from either array, skipping duplicates.
//   - Time complexity is O(m+n) as each element is visited at most once.
//   - Space complexity is O(1) as it’s in-place (excluding output).
// - **Dry Runs**:
//   - The naive approach merges, sorts, and removes duplicates, requiring extra space and more time due to sorting.
//   - The efficient approach leverages the sorted property, merging elements in a single pass with no extra space.
// - **Analysis**:
//   - Both solutions are stable in the context of union, as they output distinct elements in sorted order.
//   - The efficient solution is significantly better in terms of time (O(m+n) vs. O((m+n)*log(m+n))) and space (O(1) vs. O(m+n)).
