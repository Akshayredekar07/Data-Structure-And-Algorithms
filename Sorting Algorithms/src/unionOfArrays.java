import java.util.Arrays;

public class unionOfArrays {
    static void union(int[]a, int[]b){
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        Arrays.sort(c);
        for (int i = 0; i < c.length; i++) {
            if (i == 0 || c[i] != c[i-1]){
                System.out.print(c[i] + " ");
            }
        }
    }
}
