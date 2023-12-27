import java.util.Scanner;
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of row of matrix : ");
        int rows = in.nextInt();
        System.out.println("Enter the total number of columns of matrix : ");
        int cols = in.nextInt();

        int[][] number = new int[rows][cols];
        System.out.println("Enter the element of matrix according to number[i][j] position : ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                number[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
