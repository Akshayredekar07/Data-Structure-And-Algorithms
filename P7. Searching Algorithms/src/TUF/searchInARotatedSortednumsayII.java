package TUF;

public class searchInARotatedSortednumsayII {
    public static boolean searchInARotatedSortednumsay(int []nums, int k) {
        int n = nums.length; // size of the numsay.
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) return true;
        }
        return false;
    }

    public static boolean searchInARotatedSortednumsayBinaryII(int []nums, int k) {
        int n = nums.length; // size of the numsay.
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            //if mid points the target
            if (nums[mid] == k) return true;

            //Edge case:
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            //if left part is sorted:
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= k && k <= nums[mid]) {
                    //element exists:
                    high = mid - 1;
                } else {
                    //element does not exist:
                    low = mid + 1;
                }
            } else { //if right part is sorted:
                if (nums[mid] <= k && k <= nums[high]) {
                    //element exists:
                    low = mid + 1;
                } else {
                    //element does not exist:
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int k = 3;
        boolean ans = searchInARotatedSortednumsayBinaryII(nums, k);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the numsay.");
    }
}


