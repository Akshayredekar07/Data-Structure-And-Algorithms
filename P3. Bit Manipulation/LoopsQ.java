import java.util.Scanner;

public class LoopsQ {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Enter the value of n: ");
        n = in.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        // Continue
        for (int i = 0; i < n; i++) {
            System.out.println("Hi");
            System.out.println("Hey");
            continue;
            // This line will not be executed due to the continue statement
            // System.out.println("replay to karde");
        }

        // Q1
        for (int i = 0; i <= 5; i--) {
            System.out.print(i + " ");
        }
        
        // Q2
        for (int i = 0; i <= 15; i = i + 2) {
            System.out.print(i + " ");

            if ((i & 1) == 1) {
                continue;
            }
        }
        
        // Q3
        for (int i = 0; i < 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.println(i + " " + j);
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i; j <= 5; j++) {
                if (i + j == 10) {
                    break;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
