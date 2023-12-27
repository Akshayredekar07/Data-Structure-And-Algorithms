
public class findMinimumElement {
    public static void main(String[] args) {

        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int minElement = min(arr);
        System.out.println(minElement);
    }

    static int min(int[] arr){

        int ans = arr[0];

//        for (int j : arr) {
//            if (j < ans) {
//                ans = j;
//            }
//        }


        for (int i = 0; i < arr.length; i++){
            if (arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}
