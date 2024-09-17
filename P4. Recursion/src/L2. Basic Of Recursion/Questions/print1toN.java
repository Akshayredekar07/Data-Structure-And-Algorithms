package Basic.Questions;

public class print1toN {
    static void printNums(int i, int N){
        if (i > N)
            return;
        System.out.println(i);
        printNums(i+1, N);
    }

    public static void main(String[] args) {
        printNums(1, 5);
    }
}
