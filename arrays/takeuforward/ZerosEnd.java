package takeuforward;

public class ZerosEnd {
    public static void main(String[] args) {
        int[] a = {8, 5, 0, 10, 0, 20};
        zeros(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }

    public static void zeros(int[] arr){
        int n = arr.length;
        int [] temp = new int[n];
        int i=0;
        if(arr[i] != 0){
            temp[i] = arr[i];
            i++;
        }else{
            arr[i] = temp[n - 1 - i];
            i++;
        }
        for (int j = 0; j < temp.length; j++) {
            temp[j] = arr[j];
        }
    }
}
