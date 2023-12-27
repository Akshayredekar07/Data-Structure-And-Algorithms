import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Enter the value of n: ");
        n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        int j = 1;
        for (; j <= n; j++) {
            System.out.println(j);
        }

        int k = 1;
        for (; k <= n; ) {
            System.out.println(k);
            k++;
        }

        int l = 1;
        for (; ; ) {
            if (l <= n) {
                System.out.println(l);
            } else {
                break;
            }
            l++;
        }

        // Here, the break statement stops the execution of the loop after the condition becomes false.
        // All the variants of the for loop above work properly.

        // Multiple conditions in a for loop
        for (int a = 0, b = 1; a >= 0 && b >= 1; a--, b--) {
            System.out.println(a + " " + b);
        }

        // Fibonacci
        int fibonacciN = 10;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= fibonacciN; i++) {
            int nextNumber = a + b;
            System.out.print(nextNumber + " ");
            a = b;
            b = nextNumber;
        }

        int binaryN = 5;
        int ans = 0;
        int i = 0;
        while (binaryN != 0) {
            int bit = binaryN & 1;
            ans = (bit * (int) Math.pow(10, i)) + ans;
            binaryN = binaryN >> 1;
            i++;
        }
        System.out.println("Answer is " + ans);
    }
}
