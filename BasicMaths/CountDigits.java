/**
 * CountDigits
 */
public class CountDigits {

    public static void main(String[] args) {
        int n = 2345;
        System.out.println(countDigits(n));
    }

    static int countDigits(int n){
        
        int result = 0;
        while(n < 0){
            n = n/10;
            result++;
        }
        return result;
    }
}