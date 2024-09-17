import java.lang.reflect.Array;

public class  FlipAndInvertImage{
    public static void main (String[] args) {
    
        int[][] n= {{1,1,0},{1,0,1},{0,0,0}};
        int[][] flippedImage = flipImg(n);
        
        // Print the flipped and inverted image
        for (int[] row : flippedImage) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }

    static int[][] flipImg(int[][] image){

        for(int[] row : image){
            //Reverse the array
            for (int i = 0; i < (image[0].length + 1)/2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i -1] ^ 1;
                row[image[0].length - i -1] = temp;
            }
        }

    return image;
    }
}
