public class FunctionOverloading {
    public static int sum(int a, int b){
        return a+b;
    }    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static float mul(float a, float b){
        return a*b;
    }    public static float mul(float a, float b, float c){
        return a*b*c;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 1;
        System.out.println(sum(a, b));
        System.out.println(sum(a, b, c));
        System.out.println(mul(3.4f, 6.7f));
        System.out.println(mul(3.4f, 6.7f, 8.8f));
    }
}
