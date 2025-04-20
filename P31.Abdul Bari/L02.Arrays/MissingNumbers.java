class MissingNumbers {
    public static void findDuplicates(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
            if (arr[i] == arr[i+1]) {
                int j = i + 1;
                while (j < n && arr[j] == arr[i]) {
                    j++;
                }
                System.out.printf("%d is appearing %d times\n", arr[i], j-i);
                i = j - 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20};
        findDuplicates(arr);
    }
}

/*
Dry Run for arr = [3, 6, 8, 8, 10, 12, 15, 15, 15, 20]:

i=0: arr[0]=3  ≠ arr[1]=6    → continue
i=1: arr[1]=6  ≠ arr[2]=8    → continue
i=2: arr[2]=8  = arr[3]=8    → j=3
     while loop: j=4 (arr[4]=10)
     print "8 is appearing 2 times"
     i=3
i=4: arr[4]=10 ≠ arr[5]=12   → continue
i=5: arr[5]=12 ≠ arr[6]=15   → continue
i=6: arr[6]=15 = arr[7]=15   → j=7
     while loop: j=8, j=9 (arr[9]=20)
     print "15 is appearing 3 times"
     i=8
i=9: end

Output:
8 is appearing 2 times
15 is appearing 3 times
*/ 