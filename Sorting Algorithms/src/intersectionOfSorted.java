import java.util.Arrays;

public class intersectionOfSorted {
    public static void main(String[] args) {
        int[] a = {1, 20, 20, 40, 60};
        int[] b = {2, 20, 20, 20};
        intersectionEfficient(a, b);

    }

    static void intersection(int[] a, int[] b){
        for (int i = 0; i < a.length; i++) {
            if(i>0 && a[i]==a[i-1]){
                continue;
            }
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                System.out.print(a[i] + " ");
                break;
                }
            }
            
        }
        /*
        */
    }

    static void intersectionEfficient(int[] a, int[] b){
        int i= 0, j=0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]) {
                continue;
            }
            if(a[i]<b[j]){
                i++;
            } else if (a[i]>b[j]) {
                j++;
            }
            else {
                //a[i] == b[j];
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }

}
