public class ExORofNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findXORFrom0ToN(n));

    }

    
    public static int findXORFrom0ToN(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }

}
