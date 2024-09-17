package parameterized.function;


public class params {

    public static int f(int i, int sum){
        if (i < 1){
            System.out.println(sum);
            return 0;
        }
        return f(i-1, sum+i);
    }


    // functional approch
    public static int fun(int n){
        if (n == 0){
            return 0;
        }
        return n + fun(n-1);
    }


    public static void main(String[] args) {
        f(3, 0);

        int res = fun(3);
        System.out.println(res);
    }
}
