public class SumOfNaturals {
    public static void main(String[] args) {
        
        int n = 40;
        int res = sum(n);
        System.out.println("Sum of n natural numbers: "+ res);
        res = sum1(n);
        System.out.println("Sum of n natural normal method: "+ res);
    }


    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return sum(n-1) + n;
    }



    public static int sum1(int n){
        return (n*(n+1))/2;
    }

}
