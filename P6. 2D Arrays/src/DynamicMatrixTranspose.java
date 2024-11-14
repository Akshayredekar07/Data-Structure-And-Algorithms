import java.util.Scanner;

public class DynamicMatrixTranspose {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Prompt the user to enter the matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the original matrix
        System.out.println("\nOriginal Matrix:");
        printMatrix(matrix);

        // Transpose the matrix
        int[][] transposedMatrix = transpose(matrix);

        // Print the transposed matrix
        System.out.println("\nTransposed Matrix:");
        printMatrix(transposedMatrix);

        scanner.close();
    }

    // Method to transpose a matrix
    public static int[][] transpose(int[][] matrix) {
        if (matrix.length == 0) return new int[0][0]; // Handle empty matrix
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] transposed = new int[cols][rows]; // Create transposed matrix
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        
        return transposed;
    }

    // Utility method to print a matrix
    public static void printMatrix(int[][] matrix) {
        if (matrix.length == 0) {
            System.out.println("[]");
            return;
        }
        
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

