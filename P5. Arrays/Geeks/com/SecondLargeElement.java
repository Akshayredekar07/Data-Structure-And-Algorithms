package Geeks.com;

class SecondLargeElement {
  static int secondLargest(int arr[], int n) {
    int res = -1, largest = 0;
    for (int i = 1; i < n; i++) {
      if (arr[i] > arr[largest]) {
        res = largest;
        largest = i;
      } else if (arr[i] != arr[largest]) {
        if (res == -1 || arr[i] > arr[res]) {
          res = i;
        }
      }
    }
    return res;
  }

  public static void main(String args[]) {
    int arr[] = {10, 5, 20, 8};
    int n = arr.length;

    int resultIndex = secondLargest(arr, n);
    if (resultIndex == -1) {
      System.out.println("There is no second largest element.");
    } else {
      System.out.println("The second largest element is " + arr[resultIndex]);
    }
  }
}

/**
 Dry Run:
 Initialization:

 arr = {10, 5, 20, 8}
 n = 4
 res = -1
 largest = 0 (initially, the first element 10 is considered the largest)
 Iteration through the array:

 Iteration 1:

 i = 1
 arr[i] = 5
 Check: arr[i] > arr[largest] → 5 > 10 (False)
 Check: arr[i] != arr[largest] → 5 != 10 (True)
 res == -1 → True
 Update res to i → res = 1
 Current values: res = 1, largest = 0
 Iteration 2:

 i = 2
 arr[i] = 20
 Check: arr[i] > arr[largest] → 20 > 10 (True)
 Update res to largest → res = 0
 Update largest to i → largest = 2
 Current values: res = 0, largest = 2
 Iteration 3:

 i = 3
 arr[i] = 8
 Check: arr[i] > arr[largest] → 8 > 20 (False)
 Check: arr[i] != arr[largest] → 8 != 20 (True)
 Check: res == -1 || arr[i] > arr[res] → 0 == -1 || 8 > 10 (False)
 Current values: res = 0, largest = 2
 End of iteration:

 res holds the index of the second largest element, which is 0.
 largest holds the index of the largest element, which is 2.
 Result:

 The second largest element is at index res = 0, which is arr[0] = 10.
 */