public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println(binomial(n,r));
    }
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f*i;
        }
        return f;     
    }
    public static int binomial(int n, int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        int binCoefficient = a/(b*c);
        return binCoefficient;
    }
}
