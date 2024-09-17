package Geeks.com;

public class MaxDiff {
    public static void main(String[] args) {
        int []arr = {2,3,10,6,8,1};

        int ans = maxDiff(arr);
        System.out.println(ans);

        int[]arr1 = {10, 20, 30};
        System.out.println(maxDifference(arr1));
    }

    // Naive solution
    public static int maxDiff(int[] arr){

        int res = arr[1]-arr[0];
        for (int i=0; i<arr.length-1; i++){
            for (int j=i+1; j<arr.length; j++){
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }

    // better solution

    public static int maxDifference(int[] arr){

        int res = arr[1]-arr[0];
        int minVal = arr[0];

        for(int j=1; j<arr.length; j++){
            res = Math.max(res, arr[j]-minVal);
            minVal = Math.min(minVal, arr[j]);
        }
        return res;
    }
}
