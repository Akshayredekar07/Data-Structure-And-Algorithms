
public class MaxElementTwoDimensional {
    public static void main(String[] args) {
        int [][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int maxItem = max(arr);
        System.out.println(maxItem);

    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
/*
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
*/
        //enhance for loop
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }


        return max;
    }
}
