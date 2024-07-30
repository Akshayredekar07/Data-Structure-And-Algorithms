public class Test {
    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        int res = a&b;
        System.out.println(a);

        System.out.println(a&1);
        System.out.println(a&0);

        //OR
        a = 6;
        b = 8;
        res = a| b;
        System.out.println(res);

        //XOR
        a = 5;
        b = 10;
        res = a ^ b;
        System.out.println(res);

        a = 2;
        System.out.println(~a);
        a = 7;
        System.out.println(~a);
        a = 9;
        System.out.println(~a);

        a=5;
        int ans = a << 1;
        System.out.println(ans);
        ans = a << 2;
        System.out.println(ans);

        a = 19;
        ans = a >> 1;
        System.out.println(ans);

        ans = a >> 2;
        System.out.println(ans);



    }
}
