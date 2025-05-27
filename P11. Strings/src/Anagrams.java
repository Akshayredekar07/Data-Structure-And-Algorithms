
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(checkAnagrams(s1, s2));

        // Dry run for s1 = "listen", s2 = "silent":
        // Step 1: checkAnagrams("listen", "silent")
        //   n = s1.length() = 6, m = s2.length() = 6
        //   n == m, so proceed
        //   a1 = s1.toCharArray() = ['l', 'i', 's', 't', 'e', 'n']
        //   Arrays.sort(a1) -> a1 = ['e', 'i', 'l', 'n', 's', 't']
        //   s1 = new String(a1) = "eilnst"
        //   a2 = s2.toCharArray() = ['s', 'i', 'l', 'e', 'n', 't']
        //   Arrays.sort(a2) -> a2 = ['e', 'i', 'l', 'n', 's', 't']
        //   s2 = new String(a2) = "eilnst"
        //   s1.equals(s2) = "eilnst".equals("eilnst") = true
        // Output: true

        // Time Complexity Analysis:
        // Let n be the length of s1 and m be the length of s2.
        // Length check: O(1).
        // Converting strings to char arrays: O(n) for s1, O(m) for s2.
        // Sorting arrays using Arrays.sort (Timsort): O(n log n) for a1, O(m log m) for a2.
        // Converting sorted arrays back to strings: O(n) for s1, O(m) for s2.
        // String comparison with equals: O(n) in the worst case.
        // Since n == m for anagram comparison to proceed, total time complexity is:
        // O(n) + O(n log n) + O(n) + O(n) = O(n log n).
        // Final time complexity: O(n log n).

        // Space Complexity Analysis:
        // char[] a1 and a2: O(n) and O(m) space, respectively.
        // Sorted strings s1 and s2: O(n) and O(m) space.
        // Since n == m, total space is O(n).
        // Arrays.sort uses O(log n) space for the recursion stack in Timsort.
        // Total space complexity: O(n) for the arrays and strings, dominating O(log n).
        // Final space complexity: O(n).
    }

    public static boolean checkAnagrams(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n != m) {
            return false;
        }

        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }
}