package s5_multiple_rec_calls;

public class fibonacci {

    public static int fib(int n){
        if (n<=1) return n;
        // Recursive call
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = fib(n);
        System.out.println(ans);
    }
}

 