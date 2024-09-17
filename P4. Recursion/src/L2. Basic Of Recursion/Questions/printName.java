package Basic.Questions;

public class printName {
    public static void main(String[] args) {
        printNames(0, 4);
    }

    static void printNames(int i, int n){
        if(i > n)
            return;
        System.out.println("Akshay");
        printNames(i+1, n);
    }
}
