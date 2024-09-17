public class LeftmostNonrepeatingChar{
    public static void main(String[] args){

        String str = "geeksforgeeks";
        str="abcabc";
        str="apple";
        System.out.println(nonRepeating(str));

        //Time complexity: O(n^2)

    }


    public static int nonRepeating(String str){

        for(int i=0; i<str.length(); i++){

            boolean flag = false;

            for(int j=0; j<str.length(); j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return i;
            }
        }
        return -1;
    }
}