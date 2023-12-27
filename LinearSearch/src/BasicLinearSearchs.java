import java.util.Arrays;

public class BasicLinearSearchs {
    public static void main(String[] args) {

        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

        System.out.println("Searching into String arrays : ");
        String name = "Kunal";
        char strTarget = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchString(name, strTarget));


    }

    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

//        for (int index = 0; index < arr.length; index++){
//            int element = arr[index];
//            if(element == target){
//                return index;
//            }
//        }

        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        return -1;
    }

    //Searching in strings
    static boolean searchString(String str, char target){

        if(str.length() == 0){
            return false;
        }

        //Simple for loop
//        for (int i = 0; i < str.length(); i++){
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }

        //Using for each loops
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }

        return false;
    }
}
