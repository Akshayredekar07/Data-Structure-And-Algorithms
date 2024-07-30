import java.io.*;

public class bitwiseOperator {
    public static void main(String[] args) throws IOException{

        int x = 3;
        int y = 6;

        //bitwise and operator
        System.out.println("Bitwise and : " + (x & y));
        
        //bitwise or operator
        System.out.println("Bitwise or : " + (x | y));

        //bitwise ex-or operator
        System.out.println("Bitwise ex-or : " + (x ^ y));




        int a = 10, b = 14;

        //left shift
        System.out.println(a<<1);
        System.out.println(a<<2);
        System.out.println(a<<4);

         int k = -1;
	    System.out.println("Left shift of negative numbers");
	    System.out.println(k << 1);

        //right shift
        System.out.println(a>>1);
        System.out.println(a>>2);
        System.out.println(a>>4);
        int p = -2;
	    System.out.println("Right Shift with Negative Number "+ (p >> 1));
	    System.out.println("Unsigned Right Shift "+ (p >>> 1));


        //negation operator
        System.out.println(~a);
        System.out.println(~b);


    }
}