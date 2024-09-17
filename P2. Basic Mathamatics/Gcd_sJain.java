/**
 * Gcd_sJain
 */
public class Gcd_sJain {

    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
    }


    //naive approch
    static int gcd(int a, int b){
        int res = Math.min(a, b);
        while(res > 0){
            if(a%res == 0 && b%res == 0){
                break;
            }
            res--;
        }
        return res;
    }
    /*
     * a=10, b = 15
     * res = 10, res=9, res=8, res=7, res=6, res=5 here 5 dive both hence ans is 5
     */

    static int gcd1(int a, int b){
        if (b == 0){
            return 0;
        }
        return gcd1(b, a%b);
    }


}