package First;

import java.util.Arrays;

public class T32__MethodOverloading {
    public static void main(String[] args) {

        //case 1 : changing the integer
        int x = 45;
        change(x);
        System.out.println("Value of x after calling the change function is  " + x);

        //case 2 : changing the array
        int[] marks = {78, 98, 84, 67, 59};
        changeArray(marks);
        System.out.println(Arrays.toString(marks));

        //call overloaded functions
        talk();
        talk("Akshay !!");
    }

    static void change(int a){
        a = 99;
    }

    static void changeArray(int[] arr){
        arr[0] = 844;

    }

    //Method overloading : Two or more methods with the same name but different parameter
    // We cannot change the return type of overloaded function in method overloading

    static void talk(){
        System.out.println("Shree ram!!");
    }

    static void talk(String name){
        System.out.println("Jai Shree Ram " + name);
    }







}
