class NthFibonacci {
    public static void main(String[] args) {
        int n = 10;  // Example input
        int result = nthFib(n);
        System.out.println(n + "th Fibonacci number (mod 1e7): " + result);
    }

    static int nthFib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;
        int mod = (int) 1e7;

        for (int i = 2; i <= n; i++) {
            int c = (a % mod + b % mod) % mod;
            a = b;
            b = c;
        }
        return b;
    }
}
