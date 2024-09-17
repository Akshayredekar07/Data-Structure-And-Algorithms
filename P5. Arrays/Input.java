import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] arr = new int[5];

        System.out.println("Enter arrays element : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println();

        /* Printing array elements */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        /* Print using for each loop --> enhance for loop  */
        System.out.println(" Enhance for loop : ");
        for( int item : arr){
            System.out.print(item + " ");
        }
        System.out.println();

        // Arrays to String
        System.out.println("Arrays to string conversion : ");
        System.out.println(Arrays.toString(arr));

        //Arrays of objects
        String [] str = new String[3];
        str[0] = "Akshay";
        str[1] = "Kunal";
        str[2] = "Harsh";
        System.out.println(Arrays.toString(str));
        str[0] = "Rohit";
        System.out.println(str[0]);
        System.out.println(Arrays.toString(str));
    }
}
