public class BitWiseOperators {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        System.out.println("a & b " + (a & b));
        System.out.println("a | b " + (a | b));
        System.out.println("a ^ b " + (a ^ b));
        System.out.println(" ~a " + (~a));

        System.out.println("Right shift");

        System.out.println(17 >> 1);
        System.out.println(17 >> 2);

        System.out.println("Left shift");

        System.out.println(19 << 1);
        System.out.println(21 << 2);

        int i = 7;

        System.out.println(i++);
        // 7  i = 8
        System.out.println(++i);
        // 9  i = 9
        System.out.println(i--);
        // 9  i = 8
        System.out.println(--i);
        // 7  i = 7

        // Q1
        int x = 0, y = 1;
        int aVal = 10;
        if (++x != 0) {
            System.out.println(y);
        } else {
            System.out.println(++y);
        }

        // Q2
        int a2 = 1;
        int b2 = 2;
        if (a2-- > 0 && ++b2 > 2) {
            System.out.println("Stage 1 - inside if");
        } else {
            System.out.println("Stage 2 - inside if");
        }
        System.out.println(a2 + " " + b2);

        // Q3
        int a3 = 1;
        int b3 = 2;
        if (a3-- > 0 || ++b3 > 2) {
            System.out.println("Stage 1 - inside if");
        } else {
            System.out.println("Stage 2 - inside if");
        }
        System.out.println(a3 + " " + b3);

        // Q4
        int number = 3;
        System.out.println(25 * (++number));

        // Q5
        int a5 = 1;
        int b5 = a5++;
        int c5 = ++a5;
        System.out.println("b " + b5);
        System.out.println("c " + c5);
    }
}
