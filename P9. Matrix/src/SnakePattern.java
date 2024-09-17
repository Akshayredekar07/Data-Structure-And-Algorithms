public class SnakePattern{
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printSnakePattern(arr);
    }

    public static void printSnakePattern(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            //print even no row in start to end
            for (int j = 0; j < arr[i].length; j++) {
                if(i%2==0){
                    System.out.print(arr[i][j]+" ");
                }
            }
            for (int j = arr[i].length-1; j >= 0; j--) {
                if(i%2 != 0){
                    System.out.print(arr[i][j]+ " ");
                }
            }
            System.out.println();
        }

    }
}