package S6_print_subsequences;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class subsequences {
    static List<Integer> ds = new ArrayList<>();
    public static void printF(int ind, List<Integer> ds, int[] arr, int n) {
        if (ind == n) {
            for (int i : ds) {
                System.out.print(i + " ");
            }
            if (ds.size() == 0) {
                System.out.println("");
            } else {
                System.out.println();
            }
            return;
        }

        // take or pick the particular index into the subsequence
        ds.add(arr[ind]);
        printF(ind + 1, ds, arr, n);
        ds.remove(ds.size() - 1);

        // not pick, or not take condition, this elemnt is not added to your subsequenc
        printF(ind + 1, ds, arr, n);
    }

    /**
 * This function takes an array arr[] of size n as input and prints all the subsequences of the given array.
 * A subsequence is a sequence that appears in the array but may not necessarily occur in the same order.
 * The function uses a backtracking approach to generate all possible subsequences.
 * 
 * @param arr - input array
 * @param n - size of the input array
 */
public static void printF(int[] arr, int n) {
    List<Integer> ds = new ArrayList<>(); // create a data structure to store the subsequences

    // base case: if the current index is equal to the size of the input array, 
    // then print the current subsequence and return
    if (n == 0) {
        for (int i : ds) {
            System.out.print(i + " ");
        }
        if (ds.size() == 0) {
            System.out.println("");
        } else {
            System.out.println();
        }
        return;
    }

    // recursive case: if the current index is less than the size of the input array, 
    // then consider all possible options for the next element and recursively call the function 
    for (int i = 0; i < n; i++) {
        // take the current element into the subsequence
        ds.add(arr[i]);
        printF(arr, n - 1);
        // not take the current element, backtrack and try the next option
        ds.remove(ds.size() - 1);
    }
}

/**
 * Main function that takes input from the user and calls the printF function to print all the subsequences of the given array.
 * 
 * @param args command line arguments
 */
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the input array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the input array: ");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    printF(arr, n);
    sc.close();
}
}
