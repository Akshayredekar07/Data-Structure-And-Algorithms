public class ReverseArray {

    public static int[] rev(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static int[] revRecursive(int[] arr, int i, int j) {
        if (i >= j) {
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return revRecursive(arr, i + 1, j - 1);
    }




    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = rev(array);
        int[] reversedArrayRecursive = revRecursive(array, 0, array.length - 1);

        System.out.println(java.util.Arrays.toString(reversedArray));
        System.out.println(java.util.Arrays.toString(reversedArrayRecursive));
        }
    }
