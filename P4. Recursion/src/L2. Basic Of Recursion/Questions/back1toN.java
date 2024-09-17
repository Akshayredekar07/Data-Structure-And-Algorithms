package Basic.Questions;

public class back1toN {
    static void backTrack1toN(int i, int N){
        if (i < 1){
            return;
        }
        backTrack1toN(i-1, N);
        System.out.println(i);
    }

    public static void main(String[] args) {
        backTrack1toN(4, 4);
    }
}
