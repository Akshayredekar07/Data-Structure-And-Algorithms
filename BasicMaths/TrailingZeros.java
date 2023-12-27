/**
 * TrailingZeros
 */
public class TrailingZeros {

    public static void main(String[] args) {
        // System.out.println(Fact(10)); //not working for bigger values like 20
        System.out.println(fact1(20));

    }

    public static int Fact(int n){
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact = fact*i;
        }

        int res = 0;
        while(fact % 10 == 0){
            res++;
            fact=fact/10;
        }
        return res;
    }

    //Efficient solution-use the prime factorization method
    public static int fact1(int n){
        int res = 0;
        for (int i = 5; i <= n; i=i*5) {
            res = res + n/i;
        }
        return res;
    }

}