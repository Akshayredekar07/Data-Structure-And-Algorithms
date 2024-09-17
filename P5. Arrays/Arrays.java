public class Arrays {
    public static void main(String[] args) {

        int size = 5;
        int[] marks =new int[size];
        marks[1] = 99;
        marks[4] = 45;
        marks[0] = 76;
        marks[3] = 98;
        marks[2] = 56;

        for (int i = 0; i < size; i++) {
            System.out.print(marks[i] + " ");
        }

    }
}
