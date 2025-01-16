public class Nested {
    
    public static int nestedRecursion(int n) {
        
        if (n>100){
            return n-10;
        }

        return nestedRecursion(nestedRecursion(n+11));
    }

    public static void main(String[] args) {
        
        int result = nestedRecursion(95);
        System.out.println("Result: " + result);

    }
}