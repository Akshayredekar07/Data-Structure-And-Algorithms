#include <iostream>
using namespace std;

void findMissingNumbers(int arr[], int n) {
    int diff = arr[0] - 0;

    for (int i = 0; i < n; i++) {
        while (diff < arr[i] - i) {
            cout << (i + diff) << endl;
            diff++;
        }
    }
}

int main() {
    int arr[] = {6, 7, 8, 9, 11, 12, 15, 16, 17, 18, 19};
    int n = sizeof(arr) / sizeof(arr[0]);
    findMissingNumbers(arr, n);
    return 0;
}
