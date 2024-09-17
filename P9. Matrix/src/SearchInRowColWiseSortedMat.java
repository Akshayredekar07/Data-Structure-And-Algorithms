public class SearchInRowColWiseSortedMat {
    public static void main(String[] args) {

        int [][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}

        };
        search(arr, 39);
    }

    public static void search(int[][] mat, int x){

        if(mat.length == 0){
            return;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == x){
                    System.out.println(x+" found at ("+i+","+j+")");
                }
            }
        }
        System.out.println("Not found");
    }


    public static void searchEfficient(int[][] mat, int x){

        if(mat.length == 0){
            return;
        }


    }
}
