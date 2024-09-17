import java.util.Scanner;
public class sumOfElement{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print("Enter the element at index " + i + " : ");
            arr[i] = in.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum : " + sum);

    }
}
