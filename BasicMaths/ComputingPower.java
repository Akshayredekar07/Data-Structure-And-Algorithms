public class ComputingPower {

    public static void main(String[] args) {
        System.out.println(computingPower(2,3));
        System.out.println(computingPower1(3,2));

    }

    public static double computingPower(int x, int n){
        return Math.pow(x,n);
    }

    public static double computingPower1(int x, int n){
        if(n == 0){
            return 1;
        }
        double temp = computingPower1(x, n/2);
        temp = temp * temp;
        if(temp%2 == 0){
            return temp;
        }else{
            return temp*x;
        }
    }

}