package AlphaBatch;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        pyramid(4);
        pyramid1(5);
    }

    public static void pyramid(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n-i ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

    }

    public static void pyramid1(int n){
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n-i + 1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
