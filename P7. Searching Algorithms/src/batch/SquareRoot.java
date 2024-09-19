package batch;

public class SquareRoot {
    public static void main(String[] args) {
        // int number = 16; 
        // int result = findSquareRoot(number); 
        // System.out.println("The square root of " + number + " is: " + result); 
        int x = 10;
        int result = findSquareRoot1(x); 
        System.out.println("The square root of " + x + " is: " + result); 
    }

    public static int findSquareRoot(int x){
        int i=1;
        while (i*i<=x){
            i++;
        }
        return (i-1);
    }

    public static int findSquareRoot1(int x){
        int low=1, high=x, ans=-1;
        while (low<=high) {
            int mid=(low+high)/2;
            int mSq = mid*mid;
            if(mSq == x){
                return mid;
            }else if(mSq > x){
                high=mid-1;
            }else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
    
}
