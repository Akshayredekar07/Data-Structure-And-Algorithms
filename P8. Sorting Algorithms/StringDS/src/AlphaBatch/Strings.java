package AlphaBatch;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String s = "abcd";
        String t = new String("xyz");

        //String are immutable

        Scanner in = new Scanner(System.in);
        String name;
        // name = in.next(); // .next() only take one word
        String s1 = in.nextLine();  // .nextline() take the whole line as an input
        System.out.println(s1);

        // length of the string
        System.out.println(s1.length());

        //Concatenation
        String a = "Jet";
        String b = "brains";
        System.out.println(a + "" + b);

        //print the full string
        printLetters(b);
    }

    public static void printLetters(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();
    }
}
