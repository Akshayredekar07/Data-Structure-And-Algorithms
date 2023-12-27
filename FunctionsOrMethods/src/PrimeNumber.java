public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(5));
        printPrime(19);
    }
    public  static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for (int i = 2; i <= n-1; i++) {
            if(n%i == 0){
                return false;
            }
        }
       return true;
    }

    public static boolean optimisedPrime(int n){
        if(n==2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n){
        for (int i = 2; i <= n; i++) {
            if(isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }
}
