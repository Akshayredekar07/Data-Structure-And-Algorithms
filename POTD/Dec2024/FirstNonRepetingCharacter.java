// Non Repeating Character
// Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
// Note: When you return '$' driver code will output -1.

// Examples:

// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: In the given string, 'f' is the first character in the string which does not repeat.
// Input: s = "racecar"
// Output: 'e'
// Explanation: In the given string, 'e' is the only character in the string which does not repeat.
// Input: s = "aabbccc"
// Output: -1
// Explanation: All the characters in the given string are repeating.
// Constraints:
// 1 <= s.size() <= 10^5


public class FirstNonRepetingCharacter {

    public static void main(String[] args) {
        System.out.println(nonRepeatingChar("geeksforgeeks")); // Output: 'f'
        System.out.println(nonRepeatingChar("racecar"));       // Output: 'e'
        System.out.println(nonRepeatingChar("aabbccc"));       // Output: '$'
    }
    
    static char nonRepeatingChar(String s) {
        // HashMap<Character, Integer> charCount = new HashMap<>();
        // for (char ch : s.toCharArray()) {
        //     charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        // }
        // for (char ch : s.toCharArray()) {
        //     if (charCount.get(ch) == 1) {
        //         return ch; // Return the first non-repeating character
        //     }
        // }
        // return '$';
        
        
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return s.charAt(i); 
            }
        }
        return '$';
        
    }
}
