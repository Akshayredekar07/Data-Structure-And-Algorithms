package First;

public class T34__Recursion {

    static int factorialRecursive(int n){
        //factorial(n) = n * factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }else{
            return n * factorialRecursive(n-1);
        }
    }

    static int factorialIterative(int m){
        if(m==0 || m==1){
            return 1;
        }else {
            int product = 1;
            for (int i=1; i<=m; i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println("The factorial n value by recursive is : " + factorialRecursive(x));
        System.out.println("The factorial n value by Iterative is : " + factorialIterative(x));

        int totalTerms = 10;
        for (int i = 0; i < totalTerms; i++) {
            int ans = printFibonacci(i);
            System.out.print(ans + " ");
        }
    }

    //Exercise :- Print the fibonacci sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ......
    public static int printFibonacci(int n){
        if(n <= 1){
            return n;
        }
        int first = 0;
        int second = 1;

        int nextTerm = 0;
        for(int i = 2; i <= n; i++){
            nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        return nextTerm;
    }
}
