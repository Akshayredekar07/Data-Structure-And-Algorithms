package First;

public class T31__Methods {

    public static void main(String[] args) {
        double ans = divide(42,8);
        System.out.println(ans);
    }

    static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return (double) dividend / divisor;
    }


}
