package batch;

public class BruteForceSearch {
    public static void main(String[] args) {
        
        int[] arr = {5, 15, 25};
        int x= 25;
        int res = bruteForceSearch(arr, x);
        if(res != -1){
            System.out.println(x + " present at index " + res);
        }else{
            System.out.println(x + " is not present");
        }
        
    }

    static int bruteForceSearch(int[] arr, int x){

        if(arr.length == 0){
            return -1;
        }
            
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
