public class Subsequence {
    public static void main(String[] args) {
        // Test cases
        String[][] testCases = {
            {"abc", "ahbgdc"},          // true
            {"axc", "ahbgdc"},          // false
            {"", "ahbgdc"},             // true
            {"abc", ""},                // false
            {"grges", "geeksforgeeks"}  // true
        };

        for (String[] test : testCases) {
            String s = test[0], t = test[1];
            System.out.printf("s = \"%s\", t = \"%s\":%n", s, t);
            System.out.printf("Iterative: %b%n", checkSequence(s, t));
            System.out.printf("Recursive: %b%n%n", checkSequenceRecursive(s, t, s.length(), t.length()));
        }
    }

    public static boolean checkSequence(String s, String t) {
        int m = s.length(), n = t.length();
        int j = 0;

        // If s is longer than t, it cannot be a subsequence
        if (m > n) {
            return false;
        }

        // Iterate through t
        for (int i = 0; i < n && j < m; i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
        }

        return j == m;
        // Time Complexity: O(n), where n is the length of t
        // Space Complexity: O(1)
    }

    public static boolean checkSequenceRecursive(String s, String t, int m, int n) {
        // Base cases
        if (m == 0) return true;  // Empty s is a subsequence
        if (n == 0) return false; // Empty t but non-empty s is not a subsequence

        // If last characters match, reduce both strings
        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            return checkSequenceRecursive(s, t, m - 1, n - 1);
        } else {
            // If no match, reduce only t
            return checkSequenceRecursive(s, t, m, n - 1);
        }
        // Time Complexity: O(n), where n is the length of t
        // Space Complexity: O(n) due to recursion stack
    }

    // Dry Run for Iterative Approach: s = "abc", t = "ahbgdc"
    /*
    Input: s = "abc", t = "ahbgdc"
    m = s.length() = 3, n = t.length() = 6
    j = 0 (pointer for s)
    m <= n, so proceed

    Loop through t:
    i = 0: t.charAt(0) = 'a', s.charAt(0) = 'a' -> match, j = 1
    i = 1: t.charAt(1) = 'h', s.charAt(1) = 'b' -> no match, j = 1
    i = 2: t.charAt(2) = 'b', s.charAt(1) = 'b' -> match, j = 2
    i = 3: t.charAt(3) = 'g', s.charAt(2) = 'c' -> no match, j = 2
    i = 4: t.charAt(4) = 'd', s.charAt(2) = 'c' -> no match, j = 2
    i = 5: t.charAt(5) = 'c', s.charAt(2) = 'c' -> match, j = 3
    Loop ends

    Check: j = 3, m = 3 -> j == m is true
    Return: true
    */

    // Dry Run for Recursive Approach: s = "abc", t = "ahbgdc", m = 3, n = 6
    /*
    Initial call: s = "abc", t = "ahbgdc", m = 3, n = 6
    Stack trace:

    Call 1: m=3, n=6
    s.charAt(2) = 'c', t.charAt(5) = 'c' -> match
    Call checkSequenceRecursive(s, t, 2, 5)

    Call 2: m=2, n=5
    s.charAt(1) = 'b', t.charAt(4) = 'd' -> no match
    Call checkSequenceRecursive(s, t, 2, 4)

    Call 3: m=2, n=4
    s.charAt(1) = 'b', t.charAt(3) = 'g' -> no match
    Call checkSequenceRecursive(s, t, 2, 3)

    Call 4: m=2, n=3
    s.charAt(1) = 'b', t.charAt(2) = 'b' -> match
    Call checkSequenceRecursive(s, t, 1, 2)

    Call 5: m=1, n=2
    s.charAt(0) = 'a', t.charAt(1) = 'h' -> no match
    Call checkSequenceRecursive(s, t, 1, 1)

    Call 6: m=1, n=1
    s.charAt(0) = 'a', t.charAt(0) = 'a' -> match
    Call checkSequenceRecursive(s, t, 0, 0)

    Call 7: m=0, n=0
    m == 0 -> return true

    Return true up the stack
    Final result: true
    */
}