public class MatrixSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 8, 1},
            {4, 6, 7},
            {5, 2, 9}
        };

        // Calculate and print the sum of each row
        System.out.println("Row sums:");
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Calculate and print the sum of each column
        System.out.println("\nColumn sums:");
        for (int j = 0; j < matrix[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < matrix.length; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
    }
}
