
public class maxItem {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 9, 18};
        System.out.println(max(arr));

        System.out.println(maxRange(arr,1,3));
    }

    static int max(int[] arr){
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }

    // Max range function
    static int maxRange(int[] arr, int start, int end){
        if(end < start)
            return -1;
        if(arr == null)
            return -1;
        if(arr.length == 0)
            return -1;

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}
