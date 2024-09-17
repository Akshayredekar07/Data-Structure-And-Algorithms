package First;

public class T26__IntroductionToArrays {
    public static void main(String[] args) {

        //Classroom of 500 students , Your task is to store the marks of each student :-
        // 1. Create 500 variables
        // 2. Use array(recommended)

        int [] marks = new int[5];  // declaration and memory allocation

        marks[0] = 99;
        marks[1] = 88;
        marks[2] = 77;
        marks[3] = 66;
        marks[4] = 44;

        //Array can be override
        marks[0] = 0;



        int [] count;         //Declaration
        count = new int[3];   //memory allocation
        count[0] = 7;
        count[1] = 77;
        count[2] = 754;

        int [] physicsMarks = {56, 77, 87, 34};
        System.out.println("Array elements in the order : ");
        for (int item : physicsMarks) {
            System.out.print(" " + item);
        }
        System.out.println("Array elements in the reverse order : ");
        for (int i = physicsMarks.length -1; i >= 0; i--){
            System.out.print(" " + physicsMarks[i]);
        }


    }
}
