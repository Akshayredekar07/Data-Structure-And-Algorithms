/**
 * CountDigits
 */
public class CountDigits {

    public static void main(String[] args) {
        int n = 2345;
        System.out.println(countDigits(n));

        int digits = countDigits1(n);
        System.out.println("Total number of digits for the number are " + digits);

    }

    static int countDigits(int n){
        
        int result = 0;
        while(n < 0){
            n = n/10;
            result++;
        }
        return result;
    }

    public static int countDigits1(int n) {
        if (n == 0) {
            return 1; // Special case for 0
        }
        return (int) Math.floor(Math.log10(n)) + 1;
    }

}