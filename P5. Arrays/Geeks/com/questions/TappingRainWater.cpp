
#include <iostream>
#include <vector>
#include <algorithm> // For std::max and std::min
using namespace std;

int getWater(vector<int> &arr) {
    int n = arr.size();
    int res = 0;

    for (int i = 1; i < n - 1; i++) { // Iterate from 1 to n-2 (excluding edges)
        // Find the maximum height to the left of the current bar
        int lMax = arr[i];
        for (int j = 0; j < i; j++) {
            lMax = max(lMax, arr[j]);
        }

        // Find the maximum height to the right of the current bar
        int rMax = arr[i];
        for (int j = i + 1; j < n; j++) {
            rMax = max(rMax, arr[j]);
        }

        // Add the trapped water at the current index
        res += (min(lMax, rMax) - arr[i]);
    }

    return res;
}

int main() {
    vector<int> arr1 = {3, 0, 0, 2, 0, 4}; // Example 1
    cout << "Trapped Water: " << getWater(arr1) << endl; // Output: 10

    vector<int> arr2 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; // Example 2
    cout << "Trapped Water: " << getWater(arr2) << endl; // Output: 6

    vector<int> arr3 = {4, 2, 0, 3, 2, 5}; // Example 3
    cout << "Trapped Water: " << getWater(arr3) << endl; // Output: 9

    return 0;
}


/*
**Explanation:**

1.  **`getWater(int arr[], int n)` function:**
    *   `int res = 0;`: Initializes the variable to store the total trapped water.
    *   `for (int i = 1; i < n - 1; i++)`: The main loop iterates from the second element (`i = 1`) to the second-to-last element (`i < n - 1`). This is because water cannot be trapped at the edges of the array.
    *   **Finding `lMax` (Left Maximum):**
        *   `int lMax = arr[i];`: Initializes `lMax` with the current element's height.
        *   `for (int j = 0; j < i; j++)`: This inner loop iterates through the elements to the *left* of the current element.
        *   `lMax = max(lMax, arr[j]);`: Updates `lMax` to be the maximum height encountered so far on the left.
    *   **Finding `rMax` (Right Maximum):**
        *   `int rMax = arr[i];`: Initializes `rMax` with the current element's height.
        *   `for (int j = i + 1; j < n; j++)`: This inner loop iterates through the elements to the *right* of the current element.
        *   `rMax = max(rMax, arr[j]);`: Updates `rMax` to be the maximum height encountered so far on the right.
    *   `res += (min(lMax, rMax) - arr[i]);`: This is the crucial step. The amount of water that can be trapped at the current position `i` is determined by the *minimum* of the left and right maximums (`min(lMax, rMax)`) minus the height of the current bar (`arr[i]`). This difference is added to the total `res`.
    *   `return res;`: Returns the total trapped water.

**Example Dry Run (with `arr[] = {3, 0, 0, 2, 0, 4}`):**

*   `i = 1`:
    *   `lMax = 3`, `rMax = 4`. `min(3, 4) - 0 = 3`. `res = 3`
*   `i = 2`:
    *   `lMax = 3`, `rMax = 4`. `min(3, 4) - 0 = 3`. `res = 6`
*   `i = 3`:
    *   `lMax = 3`, `rMax = 4`. `min(3, 4) - 2 = 1`. `res = 7`
*   `i = 4`:
    *   `lMax = 3`, `rMax = 4`. `min(3, 4) - 0 = 3`. `res = 10`

The function returns 10.

**Time and Space Complexity:**

*   **Time Complexity:** O(n^2) due to the nested loops.
*   **Space Complexity:** O(1) (constant extra space).



```

1.  **`lMax` and `rMax` Arrays:**
    *   `int lMax[n];`: This array stores the maximum height of a bar to the *left* of each index `i` (inclusive).
    *   `int rMax[n];`: This array stores the maximum height of a bar to the *right* of each index `i` (inclusive).

2.  **Calculating `lMax`:**
    *   `lMax[0] = arr[0];`: The leftmost element's left maximum is itself.
    *   `for (int i = 1; i < n; i++) { lMax[i] = max(arr[i], lMax[i - 1]); }`:
    For each subsequent element, the left maximum is the maximum of the current element and the previous element's left maximum.

3.  **Calculating `rMax`:**
    *   `rMax[n - 1] = arr[n - 1];`: The rightmost element's right maximum is itself.
    *   `for (int i = n - 2; i >= 0; i--) { rMax[i] = max(arr[i], rMax[i + 1]); }`:
    For each preceding element, the right maximum is the maximum of the current element and the next element's right maximum.

4.  **Calculating Trapped Water:**
    *   `for (int i = 1; i < n - 1; i++) { res += (min(lMax[i], rMax[i]) - arr[i]); }`:
    This loop calculates the trapped water for each position. The water trapped at position `i` is determined by `min(lMax[i], rMax[i]) - arr[i]`.

**Dry Run with `arr[] = {5, 0, 6, 2, 3}`:**

1.  **Calculating `lMax`:**
    *   `lMax[0] = 5`
    *   `lMax[1] = max(0, 5) = 5`
    *   `lMax[2] = max(6, 5) = 6`
    *   `lMax[3] = max(2, 6) = 6`
    *   `lMax[4] = max(3, 6) = 6`
    *   `lMax = {5, 5, 6, 6, 6}`

2.  **Calculating `rMax`:**
    *   `rMax[4] = 3`
    *   `rMax[3] = max(2, 3) = 3`
    *   `rMax[2] = max(6, 3) = 6`
    *   `rMax[1] = max(0, 6) = 6`
    *   `rMax[0] = max(5, 6) = 6`
    *   `rMax = {6, 6, 6, 3, 3}`

3.  **Calculating Trapped Water:**
    *   `i = 1`: `min(5, 6) - 0 = 5`. `res = 5`
    *   `i = 2`: `min(6, 6) - 6 = 0`. `res = 5`
    *   `i = 3`: `min(6, 3) - 2 = 1`. `res = 6`

The function returns 5 (corrected from the previous incorrect calculation).

**Time and Space Complexity:**

*   **Time Complexity:** O(n) because there are three separate loops, each iterating through the array once.
*   **Space Complexity:** O(n) because of the `lMax` and `rMax` arrays.
*/