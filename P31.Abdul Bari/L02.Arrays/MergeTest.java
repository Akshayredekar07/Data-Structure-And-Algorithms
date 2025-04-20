public class MergeTest {
    public static void main(String[] args) {
        int[] A = {3, 8, 16, 20, 25};
        int[] B = {4, 10, 12, 22, 23};

        // Function call
        int[] C = mergeSortedArrays(A, B, A.length, B.length);

        // Print merged array
        System.out.print("Merged Array: ");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeSortedArrays(int[] A, int[] B, int m, int n) {
        int[] C = new int[m + n];  // Initialize array C with proper size
        int i = 0, j = 0, k = 0;
    
        // Merge elements from A and B into C
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
    
        // Copy remaining elements from A (if any)
        while (i < m) {  // Changed from A.length to m
            C[k++] = A[i++];
        }
    
        // Copy remaining elements from B (if any)
        while (j < n) {  // Changed from B.length to n
            C[k++] = B[j++];
        }

        return C;  
    }
}
