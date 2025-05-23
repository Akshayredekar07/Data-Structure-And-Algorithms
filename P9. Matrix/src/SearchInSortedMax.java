public class SearchInSortedMax {
    
    static void search(int[][] mat, int x) {
        int rows = mat.length;
        int cols = mat[0].length;
        
        int i = 0, j = cols - 1;

        while (i < rows && j >= 0) {
            if (mat[i][j] == x) {
                System.out.println("Found at (" + i + ", " + j + ")");
                return;
            } else if (mat[i][j] > x) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 35, 45},
            {32, 33, 39, 50}
        };
        int x = 29;       

        search(arr, x);
    }
}
