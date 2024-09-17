import java.util.Arrays;

public class Anagrams{
    public static void main(String[] args){

        String s1 = "listen";
        String s2 = "silent";

        System.out.println(checkAnagrams(s1, s2));
        
        // Time complexity: O(nlog(n)) && space complexity: O(1)


    }

    public static boolean checkAnagrams(String s1, String s2){

        int n=s1.length();
        int m=s2.length();

        if(n != m){
            return false;
        }

        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        s1 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        s2 = new String(a2);

        return s1.equals(s2);
    }
}