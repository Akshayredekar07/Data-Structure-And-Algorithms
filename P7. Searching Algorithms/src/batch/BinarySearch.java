package batch;

public class BinarySearch {
    public static void main(String[] args) {
        
        int [] arr = {10, 20, 30, 40, 50, 60};
        int x= 25;
        int res = binarySearch(arr, x);
        if(res != -1){
            System.out.println(x + " present at index " + res);
        }else{
            System.out.println(x + " is not present");
        }

    }

    static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length;

        while (low<=high) {
            int mid = (low+high)/2;

            if(arr[mid]==x){
                return mid;
            }
            else if (arr[mid]>x) {
                high=mid-1;
            } else {
                low=mid+1;
            }
        }    
        return -1;  
    }

    
}
