package AlphaBatch;

public class CheckPalin{
    public static void main(String[] args) {
    String s = "racecar";
     boolean ans = isPalin(s);
     System.out.println(ans);
    }

    public static boolean isPalin(String s){
        for (int i = 0; i < s.length() / 2; i++) {
            int n = s.length();
            if(s.charAt(i) != s.charAt(n-1-i)){
                return false; //Not a palindrome
            }
        }
        return true;
    }

    public static boolean isPalin1(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++; // Move the left pointer towards right
            right--; // Move the right pointer towards left
        }
        return true; // Palindrome
    }

    public static boolean isPalin2(String s) {
        String reversed = "";
        // Reverse the original string
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return s.equals(reversed);
    }
}
