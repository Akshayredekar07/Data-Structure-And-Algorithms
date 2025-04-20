class CountDuplicates {
    public static void countDuplicates(int[] arr) {
        int lastDuplicate = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] != lastDuplicate) {
                int count = 1;
                for (int j = i + 1; j < arr.length && arr[j] == arr[i]; j++) {
                    count++;
                }
                System.out.printf("%d appears %d times\n", arr[i], count);
                lastDuplicate = arr[i];
            }
        }

        int max = arr[arr.length - 1];
        int[] H = new int[max + 1];
        
        for (int i = 0; i < arr.length; i++) {
            H[arr[i]]++;
        }
        
        for (int i = 0; i <= max; i++) {
            if (H[i] > 1) {
                System.out.printf("%d appears %d times\n", i, H[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20};
        countDuplicates(arr);
    }
}


/*
Dry Run for arr = [3, 6, 8, 8, 10, 12, 15, 15, 15, 20]:

Method 1:
i=0: arr[0]=3  ≠ arr[1]=6    → skip
i=1: arr[1]=6  ≠ arr[2]=8    → skip
i=2: arr[2]=8  = arr[3]=8    → count=2
     print "8 appears 2 times"
     lastDuplicate = 8
i=6: arr[6]=15 = arr[7]=15   → count=3
     print "15 appears 3 times"
     lastDuplicate = 15

Method 2:
H[3]=1
H[6]=1
H[8]=2
H[10]=1
H[12]=1
H[15]=3
H[20]=1

Output:
Method 1: Duplicates with frequency
8 appears 2 times
15 appears 3 times

Method 2: Using Hash Table
8 appears 2 times
15 appears 3 times
*/