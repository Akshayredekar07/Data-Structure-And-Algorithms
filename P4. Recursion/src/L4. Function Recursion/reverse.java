package s4_problems_on_functional_rec;

public class reverse {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void f(int[] arr, int i , int n){
        if (i >= n/2){
            return;
        }
        swap(arr, i, n-i-1);
        f(arr, i+1, n);   
    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4, 5};
        int l = 0;
        int r = a.length;
        f(a, l, r);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
