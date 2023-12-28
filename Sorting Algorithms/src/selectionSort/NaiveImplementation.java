package selectionSort;

public class NaiveImplementation {
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 2, 8, 4, 1};
        selection(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void selection(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min_ind = i;  // Change initialization to i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            temp[i] = arr[min_ind];
            arr[min_ind] = INF;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}


/*
procedure selectionSort(arr)
    for i from 0 to n-1
        minIndex = i
        for j from i+1 to n-1
            if arr[j] < arr[minIndex]
                minIndex = j
        swap arr[i] with arr[minIndex]
*/
