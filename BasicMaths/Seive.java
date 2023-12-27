import java.util.Arrays;

public class Seive {
    public static void main(String[] args) {
        int n =  40;
        boolean[] primes = new boolean[n+1];
        seive(n, primes);
    }

    public static void seive(int n, boolean[] prime){
        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                for (int j = i*2; j <= n; j+= i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.println(i+" ");
            }
        }
    }

    public static void MostEfficient(int n){
        if(n <= 1)
            return;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= n; i++) {
            if(isPrime[i]){
                System.out.print(i + " ");
            }
            for (int j = i*i; j <= n ; j=j+i) {
                isPrime[j] = false;
            }
        }

    }
}
