
public class searchInRange {
    public static void main(String[] args) {

        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int ans = searchByRange(arr, 19,1,7);
        System.out.println(ans);
    }

    static int searchByRange(int[] arr, int target, int start, int end){

        if (arr.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++){
            if (target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
