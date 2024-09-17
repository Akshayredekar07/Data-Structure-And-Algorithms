package First;

import java.util.Scanner;

public class T25__PracticeSet04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter n : ");
//        int n = in.nextInt();

//        //p1
//        for (int i = n; i > 0; i--){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        
        
//        //Sum of first n even numbers
//        System.out.println("Enter the number to find sum of first n even numbers : ");
//        int num1 = in.nextInt();
//        int sum = 0;
//        for(int i = 1; i <= num1; i++){
//            if(num1 % i == 0){
//                sum+=num1;
//            }
//        }
//        System.out.println(sum);


//        //print the number table
//        for(int i = 0; i < 10; i++){
//            System.out.printf("%d X %d = %d\n", 5, i, 5 * i);
//        }

//        //print in the reverse order
//        for(int i = 10; i > 0; i--){
//            System.out.printf("%d X %d = %d\n", 5, i, 5 * i);
//        }

//        //find the factorial of the number
//        int n = 5;
//        int fact = 1;
//        for(int i = 1; i <= n; i++){
//            fact = fact*i;
//        }
//        System.out.println("Factorial : " + fact);

//        int n = 5;
//        int i = 1;
//        int f = 1;
//        while (i <= n){
//            f = f * i;
//            i++;
//        }
//        System.out.println("f : " + f);

        //p9
        int n = 8;
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d X %d = %d\n", n, i, n * i);
            sum = sum + n * i;
        }
        System.out.println("Sum of the 8th table :" + sum);

    }
}
