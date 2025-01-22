public class FirstAndLastOcc {
    public static void main(String[] args) {
        int []arr = {1,2,3,3,5};
        int [] arr1 = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
        System.out.println(firstOcc(arr1, 5) + " " + lastOcc(arr1,5));
    }

    public static int firstOcc(int [] arr, int key){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        int m = s + (e-s)/2;
        while(s<=e){
            if(arr[m] == key){
                ans = m;
                e = m-1;
            } else if (arr[m] < key) {
                s = m + 1;
            } else if (arr[m] > key) {
                e = m - 1;
            }
            m = s+(e-s)/2;
        }
        return ans;
    }

    public static int lastOcc(int [] arr, int key){
        int s = 0;
        int e = arr.length-1;
        int ans = -1;
        int m = s + (e-s)/2;
        while(s<=e){
            if(arr[m] == key){
                ans = m;
                s = m+1;
            } else if (arr[m] < key) {
                s = m + 1;
            } else if (arr[m] > key) {
                e = m - 1;
            }
            m = s+(e-s)/2;
        }
        return ans;
    }
}

/*
 * 
 Initial State:
    s = 0, e = 8, ans = -1
    arr = [1, 3, 5, 5, 5, 5, 67, 123, 125]

Step 1:
    m = s + (e - s) // 2 = 0 + (8 - 0) // 2 = 4
    arr[m] = 5 (matches key)
    Update ans = 4
    Move e = m - 1 = 4 - 1 = 3

Step 2:
    m = s + (e - s) // 2 = 0 + (3 - 0) // 2 = 1
    arr[m] = 3 (less than key)
    Move s = m + 1 = 1 + 1 = 2

Step 3:
    m = s + (e - s) // 2 = 2 + (3 - 2) // 2 = 2
    arr[m] = 5 (matches key)
    Update ans = 2
    Move e = m - 1 = 2 - 1 = 1

End:
    s = 2, e = 1 (loop ends as s > e)
    Final ans = 2

 */

 /*
  * 
  Initial State:
    s = 0, e = 8, ans = -1
    arr = [1, 3, 5, 5, 5, 5, 67, 123, 125]

Step 1:
    m = s + (e - s) // 2 = 0 + (8 - 0) // 2 = 4
    arr[m] = 5 (matches key)
    Update ans = 4
    Move s = m + 1 = 4 + 1 = 5

Step 2:
    m = s + (e - s) // 2 = 5 + (8 - 5) // 2 = 6
    arr[m] = 67 (greater than key)
    Move e = m - 1 = 6 - 1 = 5

Step 3:
    m = s + (e - s) // 2 = 5 + (5 - 5) // 2 = 5
    arr[m] = 5 (matches key)
    Update ans = 5
    Move s = m + 1 = 5 + 1 = 6

End:
    s = 6, e = 5 (loop ends as s > e)
    Final ans = 5

  */