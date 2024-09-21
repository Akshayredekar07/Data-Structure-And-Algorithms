package batch;

public class CountOnes {

    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,1};
        System.out.println(countOnes(arr));
    }

    public static int countOnes(int[] arr){
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==0){
                low=mid+1;
            }else {
                if(mid==0 || arr[mid-1]==0){
                    return (arr.length-mid);
                }else {
                    high=mid-1;
                }
            }
        }
        return 0;
    }
}


// Initial State:
// arr = {0, 0, 0, 1, 1, 1, 1}
// low = 0
// high = 6 (length of array - 1)

// Iteration 1:
// mid = (0 + 6) / 2 = 3
// arr[mid] = arr[3] = 1
// Since arr[mid] == 1:
//     mid != 0 and arr[mid-1] == arr[2] = 0 (false)
// Update high:
//     high = mid - 1 = 2

// Iteration 2:
// low = 0, high = 2
// mid = (0 + 2) / 2 = 1
// arr[mid] = arr[1] = 0
// Since arr[mid] == 0:
//     Update low:
//     low = mid + 1 = 2

// Iteration 3:
// low = 2, high = 2
// mid = (2 + 2) / 2 = 2
// arr[mid] = arr[2] = 0
// Since arr[mid] == 0:
//     Update low:
//     low = mid + 1 = 3

// End Condition:
// low = 3, high = 2 (low > high, exit loop)

// Final Check:
// mid = 3, arr[mid-1] = arr[2] = 0 (true)
// Return count of ones:
// return (arr.length - mid) = 7 - 3 = 4

// Conclusion:
// The method returns 4, which is the count of 1s in the array {0, 0, 0, 1, 1, 1, 1}.


