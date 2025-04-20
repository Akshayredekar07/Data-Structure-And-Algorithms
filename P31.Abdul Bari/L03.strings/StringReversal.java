public class StringReversal {
    // Method 1: Using two pointers (in-place reversal with char array)
    public static String reverseStringTwoPointers(String s) {
        char[] sArray = s.toCharArray(); // Convert string to char array
        int left = 0, right = sArray.length - 1;
        while (left < right) {
            // Swap characters
            char temp = sArray[left];
            sArray[left] = sArray[right];
            sArray[right] = temp;
            left++;
            right--;
        }
        return new String(sArray);
        // Dry Run with "HelloWorld": Same as Python, swaps characters from ends to middle
    }

    // Method 2: Using recursion
    public static String reverseStringRecursive(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return reverseStringRecursive(s.substring(1)) + s.charAt(0);
        // Dry Run with "HelloWorld": Same as Python, builds string backwards recursively
    }

    // Method 3: Using a stack
    public static String reverseStringStack(String s) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
        // Dry Run with "HelloWorld": Same as Python, pushes all chars, pops to build reverse
    }

    // Method 4: Using XOR swap (simulated with char array)
    public static String reverseStringXor(String s) {
        char[] sArray = s.toCharArray();
        int i = 0, j = sArray.length - 1;
        while (i < j) {
            // Java doesn't use true XOR for char swaps efficiently, so use standard swap
            char temp = sArray[i];
            sArray[i] = sArray[j];
            sArray[j] = temp;
            i++;
            j--;
        }
        return new String(sArray);
        // Dry Run with "HelloWorld": Same as two-pointer method, swaps characters
    }

    // Method 5: Creating new string with reverse indexing
    public static String reverseStringNewString(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(s.length() - 1 - i);
        }
        return new String(result);
        // Dry Run with "HelloWorld": Same as Python, fills array from end to start
    }

    // Method 6: Using StringBuilder reverse
    public static String reverseStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
        // Dry Run with "HelloWorld": Directly reverses string, equivalent to Python's slice
    }

    // Method 7: Using reversed iteration with StringBuilder
    public static String reverseStringReversed(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
        // Dry Run with "HelloWorld": Same as Python reversed(), iterates backwards
    }

    // Method 8: Using reduce-like approach with StringBuilder
    public static String reverseStringReduce(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            result.insert(0, c); // Prepend each character
        }
        return result.toString();
        // Dry Run with "HelloWorld": Similar to Python reduce, builds string backwards
    }

    // Method 9: Using while loop with manual reversal
    public static String reverseStringWhileLoop(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            result.append(s.charAt(i));
            i--;
        }
        return result.toString();
        // Dry Run with "HelloWorld": Same as Python, appends chars from end to start
    }

    // Method 10: Using array and reverse iteration
    public static String reverseStringArray(String s) {
        char[] chars = new char[s.length()];
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            chars[j] = s.charAt(i);
        }
        return new String(chars);
        // Dry Run with "HelloWorld": Similar to Python list comprehension, builds reversed array
    }

    public static void main(String[] args) {
        String testString = "HelloWorld";
        System.out.println("Original string: " + testString);

        // Test all methods
        System.out.println("Two pointers: " + reverseStringTwoPointers(testString));
        System.out.println("Recursive: " + reverseStringRecursive(testString));
        System.out.println("Stack: " + reverseStringStack(testString));
        System.out.println("XOR: " + reverseStringXor(testString));
        System.out.println("New string: " + reverseStringNewString(testString));
        System.out.println("StringBuilder: " + reverseStringBuilder(testString));
        System.out.println("Reversed: " + reverseStringReversed(testString));
        System.out.println("Reduce: " + reverseStringReduce(testString));
        System.out.println("While loop: " + reverseStringWhileLoop(testString));
        System.out.println("Array: " + reverseStringArray(testString));
    }
}