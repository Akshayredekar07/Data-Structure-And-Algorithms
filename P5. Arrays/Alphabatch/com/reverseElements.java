package Alphabatch.com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseElements {
    public static void main(String[] args) {
        int[] nums = {4, 7, 13, 17, 23};
        //bruteforce(nums);
        rev(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static  void  bruteforce(int[] nums){
        /*
        Time Complexity: O(n)
        Space Complexity: O(n)
        */
        int[]newArr = new int[5];
        for (int i = newArr.length-1, j=0; i >= 0 ; i--, j++) {
            newArr[j] = nums[i];
        }
        System.out.print(Arrays.toString(newArr));
    }

    public static void rev(int [] nums){
        int first = 0;
        int last = nums.length-1;
        while (first < last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;

            first++;
            last--;
        }
    }
}

