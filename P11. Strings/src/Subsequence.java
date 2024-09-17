
public class Subsequence{
    public static void main(String[] args){

        String s1 = "geeksforgeeks";
        String s2 = "grges";
        
        System.out.println(checkSequence(s1,s2));

        // Time complexity: O(n+m) && space complexity: O(1)

        int n=s1.length();
        int m=s2.length();
        System.out.println(checkSequenceRecursive(s1,s2, n, m));

        // Time complexity: O(n+m) && space complexity: O(n+m)


    }

    public static boolean checkSequence(String s1, String s2){

        int n=s1.length();
        int m=s2.length();
        int j=0;

        if(m<n){
            return false;
        }

        for(int i=0; i<n && j<m; i++){
            if(s1.charAt(i)==s2.charAt(j)){
                j++;
            }
        }
        return (j==m);
    }

    public static boolean checkSequenceRecursive(String s1, String s2, int n, int m){



        if(m==0)
            return true;

        if(n==0)
            return false;

        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return checkSequenceRecursive(s1, s2, n-1, m-1);
        }else{
            return checkSequenceRecursive(s1, s2, n-1, m);
        }                        

    }
}

