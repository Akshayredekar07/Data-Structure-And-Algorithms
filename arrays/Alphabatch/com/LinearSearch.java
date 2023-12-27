package Alphabatch.com;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {97, 99, 95, 91, 93, 99};
        int key = 91;
        int index = linear(arr,key);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key found at index " + index);
        }
    }

    public static int linear(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
