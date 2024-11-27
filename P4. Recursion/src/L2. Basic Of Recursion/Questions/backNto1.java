package Basic.Questions;

public class backNto1 {
    static void printNums(int N){
        if (N < 1) {
            return;
        }
        System.out.println(N);
        printNums(N-1);
    }

    public static void main(String[] args) {
        printNums(3);
    }
}
