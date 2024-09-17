package First;

import java.util.Scanner;

public class T35__MethodsPS {

//    //Q- Write a java method to print multiplication table of a number n
//    static void multiTable(int k){
//        int product = k;
//        for (int i=1; i<=10; i++){
//            System.out.format("%d X %d = %d\n " ,k, i, k*i);
//        }
//    }

//    //Q- print the pattern
//    static void pattern1(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

    //Question3 : write a recursive function to calculate sum of first n natural numbers
    // sum(n) = 1 + 2 + 3 ....+ n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    static int sumOfNaturals(int n){
        //Base condition
        if(n==1){
            return 1;
        }
        return n + sumOfNaturals(n-1);
    }

    static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    //problem 4: fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21,34
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    //****
    //***
    //**
    //* print this pattern
    static void patt(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);

            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static float celciusToFarenheit(float tempInCelcius){

        return (tempInCelcius*9/5) + 32;
    }



    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
//       System.out.println("Enter the number : ");
//       int a = in.nextInt();
//       System.out.println("Multiplication table is : ");

//       multiTable(a);

//       pattern1(4);

//       int c = sumOfNaturals(5);
//       System.out.println(c);

//       pattern2(4);

//       int result = fib(7);
//       System.out.println(result);

        pattern_rec(5);

//        patt(5);

        float temprature = 37.97f;
        System.out.println(celciusToFarenheit(temprature));




    }
}
