
public class decimal_to_bin{
    public static void main (String[] args) {
        
        int n = 10;

        int ans = 0;
        int i = 0;
        while(n != 0){

            int bit = n&1;
            ans = (bit << i) + ans ;
            n = n >> 1;
            i++;
        }

        System.out.println("Ans is " + ans);

    }
}