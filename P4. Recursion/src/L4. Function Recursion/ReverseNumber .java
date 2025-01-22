public class ReverseNumber {

    public static void main(String[] args) {
        int n = 1234;
        int digits = String.valueOf(n).length(); // Calculate the number of digits
        int reversed = reverseNumber(n, digits);
        System.out.println("Reversed number: " + reversed);
    }

    // Recursive helper function
    public static int reverseNumber(int n, int digits) {
        // Base case: if the number is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Extract the last digit
        int lastDigit = n % 10;
        // Recursively calculate the reversed number
        return lastDigit * (int) Math.pow(10, digits - 1) + reverseNumber(n / 10, digits - 1);
    }
}
