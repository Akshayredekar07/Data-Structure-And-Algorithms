import java.util.ArrayList;
import java.util.Scanner;

public class BasicArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();
        list.add(43);
        list.add(67);
        list.add(65);
        list.add(77);
        list.add(99);
        System.out.println(list);

        list.contains(99);  // find element present or not return boolean

        list.set(0, 244);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);

        // Add element using for loop in the arraylist
        System.out.println("Add element : ");
        for( int i = 4; i < 9; i++){
            list.add(in.nextInt());
        }
        //print arraylist items
        for( int i = 0; i < 9; i++){
            System.out.println(list.get(i));
        }


     }
}
