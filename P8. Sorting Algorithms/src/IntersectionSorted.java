
public class IntersectionSorted {
    // Naive Solution: Compare each element of a with each element of b
    static void intersectionNaive(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            // Skip duplicates in a to print each value only once
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break; // Break after finding the first match in b
                }
            }
        }
    }

    // Efficient Solution: Use two pointers to traverse both arrays
    static void intersectionEfficient(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            // Skip duplicates in a to print each value only once
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else { // a[i] == b[j]
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 20, 20, 40, 60};
        int[] b = {2, 20, 20, 20};
        System.out.println("Naive Approach Output:");
        intersectionNaive(a, b);
        System.out.println("\nEfficient Approach Output:");
        intersectionEfficient(a, b);
        System.out.println();
    }

    /*
    Structured Dry Run for Naive Approach (intersectionNaive)
    a = [1, 20, 20, 40, 60], b = [2, 20, 20, 20]

    i = 0:
      - a[0] = 1
      - j = 0: b[0] = 2, 1 != 2
      - j = 1: b[1] = 20, 1 != 20
      - j = 2: b[2] = 20, 1 != 20
      - j = 3: b[3] = 20, 1 != 20
      - No match, continue

    i = 1:
      - a[1] = 20
      - j = 0: b[0] = 2, 20 != 2
      - j = 1: b[1] = 20, 20 == 20, print 20, break

    i = 2:
      - a[2] = 20, a[2] == a[1], skip (duplicate)

    i = 3:
      - a[3] = 40
      - j = 0: b[0] = 2, 40 != 2
      - j = 1: b[1] = 20, 40 != 20
      - j = 2: b[2] = 20, 40 != 20
      - j = 3: b[3] = 20, 40 != 20
      - No match, continue

    i = 4:
      - a[4] = 60
      - j = 0: b[0] = 2, 60 != 2
      - j = 1: b[1] = 20, 60 != 20
      - j = 2: b[2] = 20, 60 != 20
      - j = 3: b[3] = 20, 60 != 20
      - No match, continue

    Output: 20

    Structured Dry Run for Efficient Approach (intersectionEfficient)
    a = [1, 20, 20, 40, 60], b = [2, 20, 20, 20]

    Initial: i = 0, j = 0

    Step 1: i = 0, j = 0
      - a[0] = 1, b[0] = 2
      - 1 < 2, i++ → i = 1

    Step 2: i = 1, j = 0
      - a[1] = 20, b[0] = 2
      - 20 > 2, j++ → j = 1

    Step 3: i = 1, j = 1
      - a[1] = 20, b[1] = 20
      - 20 == 20, print 20, i++ → i = 2, j++ → j = 2

    Step 4: i = 2, j = 2
      - a[2] = 20, a[2] == a[1], skip (duplicate), i++ → i = 3

    Step 5: i = 3, j = 2
      - a[3] = 40, b[2] = 20
      - 40 > 20, j++ → j = 3

    Step 6: i = 3, j = 3
      - a[3] = 40, b[3] = 20
      - 40 > 20, j++ → j = 4 (j >= b.length, break)

    Loop ends (j reached end of b)

    Output: 20

    Analysis for Naive Approach (intersectionNaive)
    Time Complexity:
    - Worst/Avg: O(m*n), outer loop m times, inner loop up to n times, total ~m*n comparisons.
    - Best: O(m*n), no improvement even if no matches, as all elements are compared.
    Space Complexity: O(1), in-place, uses only i, j, and no extra space beyond output.
    Stability: Yes, processes arrays in order, preserving relative order of duplicates in output.
    Why Stable: Iterates in order, skips duplicates in a, prints matches as encountered (e.g., [5a, 5b] ∩ [5c, 5d] → 5).

    Analysis for Efficient Approach (intersectionEfficient)
    Time Complexity:
    - Worst/Avg: O(m+n), single while loop, each element in a and b visited at most once.
    - Best: O(min(m,n)), if one array is much shorter and no matches, loop exits early.
    Space Complexity: O(1), in-place, uses only i, j, and no extra space beyond output.
    Stability: Yes, processes arrays in order, preserving relative order of duplicates in output.
    Why Stable: Two-pointer approach moves sequentially, skips duplicates in a, prints matches in order (e.g., [5a, 5b] ∩ [5c, 5d] → 5).
    */
}


// ### Output
// ```
// Naive Approach Output:
// 20 
// Efficient Approach Output:
// 20 
// ```

// ### Explanation of the Code
// - **Naive Approach (`intersectionNaive`)**:
//   - Uses nested loops to compare each element of `a` with each element of `b`.
//   - Skips duplicates in `a` by checking `a[i] == a[i-1]` to avoid printing the same value multiple times.
//   - Prints a common element the first time it’s found in `b` and breaks the inner loop to avoid duplicate matches.
//   - Time complexity is O(m*n) due to the nested loops.
// - **Efficient Approach (`intersectionEfficient`)**:
//   - Uses two pointers (`i` for `a`, `j` for `b`) to traverse both arrays simultaneously.
//   - Leverages the sorted property: if `a[i] < b[j]`, increment `i`; if `a[i] > b[j]`, increment `j`; if equal, print and increment both.
//   - Skips duplicates in `a` to ensure distinct output values.
//   - Time complexity is O(m+n) as each element is visited at most once.
// - **Dry Runs**:
//   - The naive approach exhaustively compares all pairs, leading to O(m*n) time.
//   - The efficient approach uses the sorted property to minimize comparisons, achieving O(m+n) time.
// - **Analysis**:
//   - Both solutions are in-place (O(1) space) and stable in the context of intersection (preserving the order of distinct elements).
//   - The efficient solution is significantly faster for large arrays due to its linear time complexity.

