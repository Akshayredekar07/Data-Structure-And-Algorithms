package AlphaBatch;

public class HollowRectangle {

    public static void main(String[] args) {
        rect(4,5);
    }

    public static void rect(int r, int c){
        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= c; j++) {
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
