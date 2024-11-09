import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        
        // int [] A = new int [5];
        // A[0] = 12;
        // A[1] = 15;
        // A[2] = 25;
        
        // int sizeOfA = A.length*Integer.BYTES;
        // System.out.println(sizeOfA+ " bytes");
        // System.out.println(A[0]);
        // System.out.println(A[1]);


        int [] A = {2,3,4,5,6,7,8,9,22,34};

        // for(int i= 0; i<10; i++){
        //     System.out.print(A[i]+ " ");
        // }

        for (int x : A) {
            System.out.print(x+" ");
        }  


        Scanner in = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = in.nextInt();
        int [] B = new int[n];
        B[0] = 2;

        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
        
    }
}

