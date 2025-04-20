#include <iostream>
#include <vector>

using namespace std;

void findMissingEfficient(vector<int>& arr, int n) {
    vector<int> hashArr(n + 1, 0); // Create hash array of size (n+1) initialized to 0

    // Mark presence of elements in arr
    for (int num : arr) {
        if (num <= n) { // Ensure within range
            hashArr[num]++;
        }
    }

    // Find missing numbers
    for (int i = 1; i <= n; i++) { // Check from 1 to n
        if (hashArr[i] == 0) {
            cout << "Missing number: " << i << endl;
        }
    }
}

int main() {
    vector<int> arr = {3, 7, 4, 9, 12, 6, 1, 11, 2, 10}; // Given array
    int n = 12; // Expected range from 1 to 12
    findMissingEfficient(arr, n);
    return 0;
}
