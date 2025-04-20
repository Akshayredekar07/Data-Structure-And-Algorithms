
public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        int lastDuplicate = -1;  // Use -1 to handle all possible values in the array

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] != lastDuplicate) {
                System.out.println(arr[i]);
                lastDuplicate = arr[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20};
        findDuplicates(arr);
    }
}


/*
 * 
 Start Loop (i = 0 to arr.length - 1)
|
|-- i = 0, arr[i] = 3, arr[i+1] = 6
|   |-- Condition: 3 == 6 → False (Move to next iteration)
|
|-- i = 1, arr[i] = 6, arr[i+1] = 8
|   |-- Condition: 6 == 8 → False (Move to next iteration)
|
|-- i = 2, arr[i] = 8, arr[i+1] = 8
|   |-- Condition: 8 == 8 → True
|   |-- Check: 8 != lastDuplicate (-1) → True
|   |-- Print: 8
|   |-- Update lastDuplicate = 8
|
|-- i = 3, arr[i] = 8, arr[i+1] = 10
|   |-- Condition: 8 == 10 → False (Move to next iteration)
|
|-- i = 4, arr[i] = 10, arr[i+1] = 12
|   |-- Condition: 10 == 12 → False (Move to next iteration)
|
|-- i = 5, arr[i] = 12, arr[i+1] = 15
|   |-- Condition: 12 == 15 → False (Move to next iteration)
|
|-- i = 6, arr[i] = 15, arr[i+1] = 15
|   |-- Condition: 15 == 15 → True
|   |-- Check: 15 != lastDuplicate (8) → True
|   |-- Print: 15
|   |-- Update lastDuplicate = 15
|
|-- i = 7, arr[i] = 15, arr[i+1] = 15
|   |-- Condition: 15 == 15 → True
|   |-- Check: 15 != lastDuplicate (15) → False (Skip)
|
|-- i = 8, arr[i] = 15, arr[i+1] = 20
|   |-- Condition: 15 == 20 → False (Move to next iteration)
|
End Loop (i = 9, loop terminates)

 */