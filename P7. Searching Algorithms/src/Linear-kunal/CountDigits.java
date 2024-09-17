public class CountDigits {
    public static void main(String[] args) {
        int n =2345;
        System.out.println(even(n));

    }
    public static boolean even(int n){
        int noOfDigits = countDigit(n);
        return noOfDigits%2 == 0;
    }
    public static int countDigit(int n){
        int count = 0;
        if(n != 0){
            count++;
            n = n/10;
        }
        return count;
    }
}
