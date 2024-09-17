package First;

import java.util.Arrays;

public class T29__PracticeSet06 {
    public static void main(String[] args) {

//        //Create an array of 5 floats and calculate sum
//        float[] floats = {4.56f, 6.67f, 7.86f, 9.98f, 2.3f};
//        float floatSum = 0;
//        for (float aFloat : floats) {
//            floatSum = floatSum + aFloat;
//        }
//        System.out.println("Sum of Floats arrays elements : " + floatSum);


//        //p2 : linear search
//        int[] linearArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int key = 7;
//        int l = linearArr.length - 1;
//        for(int i= 0; i <= l; i++){
//            if(linearArr[i] == key){
//                System.out.println("Key is present : " + key);
//            }
//        }
//        System.out.println("Key is not present ");


        //p 4
        int[][] mat1 = { {1, 2},
                         {3, 4}};

        int[][] mat2 = { {7, 8},
                         {3, 4}};

        int[][] result = {{0, 0},
                           {0, 0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        //swapping arrays
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,  10};
        int max = Integer.MIN_VALUE;
        for (int e : arr){
            if (e > max){
                max = e;
            }
        }
        System.out.println(max);



    }
}
