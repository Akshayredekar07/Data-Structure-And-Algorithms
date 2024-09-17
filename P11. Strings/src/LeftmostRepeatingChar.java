import java.util.Arrays;

public class LeftmostRepeatingChar{
    public static void main(String[] args){

        String str = "acbbad";

        System.out.println(leftmost(str));
        // Time complexity: O(n^2) && space complexity: O(1)

        System.out.println(leftmost1(str));
        // Time complexity: O(n) && space complexity: O(1)

        System.out.println(leftMost(str));
        // Time complexity: O(n+CHAR) && space complexity: O(CHAR)

    }

    public static int leftmost(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }

    static final int CHAR=256;

    public static int leftmost1(String str){

        int[] count = new int[CHAR];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)]++;
        }
        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i)] > 1){
                return 1;
            }
        }
        return -1;
    }

    // static final int CHAR = 256;

    public static int leftMost(String str) {

        int[] fIndex = new int[CHAR];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {

            int fi = fIndex[str.charAt(i)];

            if (fi == -1)
                fIndex[str.charAt(i)] = i;
            else
                res = Math.min(res, fi);
        }
         return (res == Integer.MAX_VALUE) ? -1 : res;
    }

}