package takeuforward;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={34, 56, 24, 75, 19, 90, 2, 81};
        int ans = findSecondLargestBrute(arr);
        System.out.println("Second Largest brute: "+ ans);

        ans = findSecondLargestBetter(arr);
        System.out.println("Second Largest Better: "+ ans);
    }

    private static int findSecondLargestBrute(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        int largest=arr[n-1];
        int second=Integer.MIN_VALUE;
        for(int i=n-2; i>=0; i++){
            if(arr[i] != largest){
                second=arr[i];
                break;
            }
        }
        return second;
    }

    private static int findSecondLargestBetter(int[]arr){
        int largest=arr[0];
        for(int j: arr){
            if(largest < j){
                largest = j;
            }
        }

        //SecondLargest
        int secondLargest = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > secondLargest && j != largest) {
                secondLargest = j;
            }
        }

        return secondLargest;
    }

    private static int findSecondLargestOptimal(int[]arr){
        int largest=arr[0];
        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if(largest < arr[i]){
                secondLargest=largest;
                largest = arr[i];
            }
        }
        return largest;
    }

}
