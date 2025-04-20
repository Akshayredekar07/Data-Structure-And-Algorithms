
class MissingNumbers {
    public static void findMissingNumbers(int[] arr) {
        int n = arr.length;
        int diff = arr[0] - 0;

        for (int i = 0; i < n; i++) {
            while (diff < arr[i] - i) {
                System.out.println(i + diff);
                diff++;
            }
        }
    }

        public static void findMissingNumber1(int[] arr, int n) {
            int S = n * (n + 1) / 2; // Sum of first n natural numbers
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            int missing = S - sum;
            System.out.println("Missing No is " + missing);
        }
    

    
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 11, 12, 15, 16, 17, 18, 19};
        findMissingNumbers(arr);
    }
}


