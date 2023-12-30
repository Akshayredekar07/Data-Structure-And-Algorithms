package First;

public class T33__VariableArguments {

   static int sum(int a, int b){
       return a + b;
   }

   static int sum(int a, int b, int c){
       return a + b + c;
   }

    public static int sum(int x, int ...arr){
        //Available as int [] arr;
        int result = 0;
        for(int a: arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        //System.out.println("Sum of nothing : " +  sum());  //This type it will return 0
        System.out.println("Minimum 1 arguments required" + sum(1));
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 4 ,3 and 5 is: " + sum(4, 5, 3));
        System.out.println("The sum of 4 ,3, 6, 5 is: " + sum(4, 3,6,5));

    }
}
