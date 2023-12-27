/**
 * Factorial
 */
public class Factorial {

    public static void main(String[] args) {
        // System.out.println(iterativeFact(5));
        System.out.println(recursiveFact(5));
    }

   //Iterative solution
    public static int iterativeFact(int n){
        int fac = 1;
        for(int i=2; i<=n; i++){
            fac = fac*i;
        }
        return fac;
    }

    public static int recursiveFact(int n){
        if(n < 0){
            n = n *(-1);
        }
        if( n==0 || n == 1){
            return 1;
        }
        return  n * recursiveFact(n-1);
    }
}