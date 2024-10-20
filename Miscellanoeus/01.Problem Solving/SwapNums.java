import java.util.*;

class SwapNums {

    static void swap(int a, int b) {
        System.out.println("before swaping a=" + a + " and b=" + b);
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("after swaping a=" + a + " and b=" + b);
    }

    // Logic2:
    // ==> print a and b values
    // ==> by using addition and subtraction
    static void swap1(int a, int b) {
        System.out.println("before swaping a=" + a + " and b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swaping a=" + a + " and b=" + b);
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = obj.nextInt();
        System.out.println("Enter b value");
        int b = obj.nextInt();
        // SwapNums.swap(a, b);
        SwapNums.swap1(a, b);
    }
}