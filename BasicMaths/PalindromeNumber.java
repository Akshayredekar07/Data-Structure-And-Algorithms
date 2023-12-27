/**
 * PalindromeNumber
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        int n = 121;
        System.out.println(palin(n));
    }

    public static boolean palin(int n){

        int rev = 0;
        int temp = n;
        while(temp != 0){
            int rd = temp % 10;
            rev = rev*10 + rd;
            temp = temp / 10;
        }
        return (rev == n);
    }

    public static int reverse(int n){
        int res = 0;
        while(n > 0){
            int digit = n % 10;
            res = digit*10 + res;
            n=n/10;
        }
        return res;
    }
    
}
