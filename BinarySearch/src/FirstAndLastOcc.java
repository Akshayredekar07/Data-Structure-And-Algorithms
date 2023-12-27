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
