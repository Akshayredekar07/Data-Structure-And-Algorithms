package Basic.Questions;

public class backNto1 {
    static void printNums(int i ,int N){
        if (i < 1) {
            return;
        }
        printNums(i-1, N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        printNums(3, 3);
    }
}
