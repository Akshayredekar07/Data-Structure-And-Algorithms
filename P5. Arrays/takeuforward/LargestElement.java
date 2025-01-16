package takeuforward;
import java.util.Arrays;
public class LargestElement{
    public static void main(String []args){
        int arr[]={3,2,1,5,2};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Largest Element: "+arr[arr.length-1]);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int arr1[] ={3,2,1,5,2,6,7,0, 14};
        int ans=findLargest(arr);
        System.out.println("Largest element is: "+ ans);
    }

    public static int findLargest(int [] arr){
        int largest=arr[0];
        for (int j : arr) {
            if (largest < j) {
                largest = j;
            }
        }
        return largest;
    }


}

