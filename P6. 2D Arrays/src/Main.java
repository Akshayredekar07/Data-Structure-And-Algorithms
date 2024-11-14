public class Main {
    public static void main(String[] args) {
        // Declaring a 2D array
        int[][] matrix = new int[3][4]; // 3 rows, 4 columns

        // Initializing with values
        int[][] matrix11 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };

        for (int i = 0; i < matrix.length; i++) { // Loop over rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop over columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        // 5. Transposing a 2D Array
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // 6. Multiplying Two 2D Arrays
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
        int[][] matrix2 = {
                { 7, 8 },
                { 9, 10 },
                { 11, 12 }
        };
        int[][] product = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // 7. Finding the Maximum Element
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum element: " + max);

        // 8. Searching for an Element

        int target = 7;
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        if (found) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }

    }
}