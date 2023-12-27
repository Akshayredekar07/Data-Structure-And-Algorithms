public class DivisorOFNumber {
    public static void main(String[] args) {
        // printDivisor(100);
        moreEfficientPrint(15);
    }

    public static void printDivisor(int n){

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void printDivisor1(int n){

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }


    public static void moreEfficientPrint(int n){
        int i;
        for (i = 1; i*i < n; i++) {
            if(n%i == 0){
                System.out.println(i);
            }
        }

        for( ; i >= i; i--){
            if(n%i == 0){
                System.out.println(n/i);
            }
        }
    }
    
}
