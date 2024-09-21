package batch;
import java.util.ArrayList;
import java.util.Arrays;

public class searcElementRotatedSortedArray {

    public static int search(ArrayList<Integer> arr, int k, int n){

        for(int i=0; i<n; i++){
            if(arr.get(i) == k){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int n = 9, k = 1;
        int ans = search(arr, k, n); 
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
    
}
