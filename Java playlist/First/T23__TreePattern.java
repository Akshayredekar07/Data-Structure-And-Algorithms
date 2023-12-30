package First;

import java.util.Scanner;

public class T23__TreePattern {
    public static void main(String[] args) {
        int treeHeight = 5;
        int spaceCount = treeHeight - 1;
        int starCount = 1;

        for (int i = 0; i < treeHeight; i++) {
            // Print spaces
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

            // Update space and star counts for the next line
            spaceCount--;
            starCount += 2;
        }


        //first n odd numbers
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        for (int i = 0; i <= n; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        for (int i = 100; i > 0; i =i-15) {
            System.out.print(i + " ");

        }
    }
}
