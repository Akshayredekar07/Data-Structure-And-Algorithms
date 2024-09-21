package batch;

public class SearchInfiniteSortedArray {
    public static int searchInfiniteSortedArray(int[] arr, int x) {
        int i = 0;
        while (true) {
            if (arr[i] == x) {
                return i;
            }
            if (arr[i] > x) {
                return -1;
            }
            i++; 
        }
    }

    public static int efficientApproach(int[] arr, int x){
        if(arr[0] == x) return 0;
		int i = 1;
		while(arr[i] < x)
			i = i * 2;
		if(arr[i] == x) return i;

		return recursiveBinarySearch(arr, i / 2 + 1, i - 1, x);
    }

    static int recursiveBinarySearch(int[] arr, int low, int high, int x) {

        if (high < low) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return recursiveBinarySearch(arr, low, mid - 1, x);
        } else {
            return recursiveBinarySearch(arr, mid + 1, high, x);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int x = 20;
        int res = efficientApproach(arr, x);
        if (res != -1) {
            System.out.println(x + " present at index " + res);
        } else {
            System.out.println(x + " is not present");
        }
    }
}


/*
 # Dry run of the efficient_approach function with arr = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100] and x = 70

# Initial values
arr = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
x = 70

# Check if the first element is the target
if arr[0] == x:  # arr[0] is 10, which is not equal to 70
    return 0  # This condition is false, so we move on

# Initialize i
i = 1

# Double i until arr[i] is greater than or equal to x
# Iteration 1:
while arr[i] < x:  # arr[1] is 20, which is less than 70
    i *= 2;  # i becomes 2

# Iteration 2:
while arr[i] < x:  # arr[2] is 30, which is less than 70
    i *= 2;  # i becomes 4

# Iteration 3:
while arr[i] < x:  # arr[4] is 50, which is less than 70
    i *= 2;  # i becomes 8

# Iteration 4:
while arr[i] < x:  # arr[8] is 90, which is greater than 70
    // Loop exits

# Check if arr[i] is equal to x
if arr[i] == x:  # arr[8] is 90, which is not equal to 70
    return i;  # This condition is false

# Perform binary search
return recursive_binary_search(arr, i / 2 + 1, i - 1, x);  # i / 2 + 1 = 5, i - 1 = 8

# Recursive Binary Search Steps:
# First Call: recursive_binary_search(arr, 5, 8, 70)
# mid = (5 + 8) / 2 = 6
# arr[6] is 70, which matches x.
# Return 6.

# Final output
# The function would return 6, indicating that 70 is present at index 6
*/
