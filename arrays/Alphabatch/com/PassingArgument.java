package Alphabatch.com;

public class PassingArgument {
    public static void main(String[] args) {
        int marks[] = {97, 99, 95, 91, 93, 99};
        System.out.println("After adding 5 to the array of element: ");
        update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }

    public static  void update(int marks[] ){
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i]+5;
        }
    }
}
