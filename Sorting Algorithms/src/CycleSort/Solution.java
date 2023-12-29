package CycleSort;

class Solution {



    static int missingNumber(int[] nums){
        int i=0;
        while (i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length &&  nums[i] != nums[correct]){
                int temp = nums[i];
                nums [i] = nums[correct];
                nums[correct] = temp;
            }else {
                i++;
            }
        }
        //Search for the first missing number
        for (int index = 0; index <nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }

        return nums.length;
    }


//    class Solution {
//        public int missingNumber(int[] nums) {
//            int len = nums.length;
//            int sum = (1 + len) * len / 2;
//            for(int n : nums){
//                sum -= n;
//            }
//            return sum;
//        }
//    }




    public static void main(String[] args) {
        // Test the missingNumber function
        int[] nums1 = {3, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums1)); // Expected output: 2

        int[] nums2 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number: " + missingNumber(nums2)); // Expected output: 8
    }

}