package intoduction.recursion;

public class PrintFunction {

    public static void main(String[] args) {
        print(0);
    }

    static void print(int count) {
        if (count >= 10) {
            return;
        }
        System.out.println(count);
        print(count + 1);
    }
}
