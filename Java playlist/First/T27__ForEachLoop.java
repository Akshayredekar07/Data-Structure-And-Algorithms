package First;

public class T27__ForEachLoop {
    public static void main(String[] args) {


        int [] physicsMarks = {56, 77, 87, 34};

        System.out.println("Array elements in the order : ");
        for (int item : physicsMarks) {
            System.out.print(" " + item);
        }
        System.out.println();


        System.out.println("Array elements in the reverse order : ");
        for (int i = physicsMarks.length -1; i >= 0; i--){
            System.out.print(" " + physicsMarks[i]);
        }

    }
}
