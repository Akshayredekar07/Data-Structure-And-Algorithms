public class SwapNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a,b);
    }
    /* Java always use the call by value  that is it create the copy of the passed value*/
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = a;
        System.out.println(a + "\n" + b);
    }
}
