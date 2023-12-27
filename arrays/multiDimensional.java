import java.util.Arrays;
import java.util.Scanner;

public class multiDimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*   2D arrays   */
        //int [][] arr = new int[3][3];

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        //print 2D array
//        for (int row = 0; row < 3; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // Taking input
        int[][] arrIn = new int[3][3];

        System.out.println("Input numbers : ");
        for (int row = 0; row < arrIn.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arrIn[row][col] = in.nextInt();
            }
        }

//        for (int row = 0; row < arrIn.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arrIn[row][col] + " ");
//            }
//            System.out.println();
//        }

        // Enhance for loop
//        for (int[] ints : arrIn) {
//            System.out.println(Arrays.toString(ints));
//        }
//
        for(int i = 0; i < arrIn.length; i++){
            System.out.println(Arrays.toString(arrIn[i]));
        }
    }
}
