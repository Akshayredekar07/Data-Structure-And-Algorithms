public class 1308NthFibonnaci{
    public static void main(String[] args) {
        
    }

    static int nthFib(int n){
        if(n==0){
            return 0;
        }

        int a=0, b=1;
        int mod = (int)1e+7;
        n = n-2;
        while(n-->=0){
            int c = (a%mod + b%mod)%mod;
            a=b;
            b=c;
        }
        return b;
    }
}