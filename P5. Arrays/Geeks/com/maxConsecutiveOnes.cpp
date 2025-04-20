#include <iostream>
#include <algorithm>
using namespace std;

int maxConsecutiveOnes(bool arr[], int n) {
    int res = 0;
    for (int i = 0; i < n; i++) {
        int curr = 0;
        for (int j = i; j < n; j++) {
            if (arr[j] == 1)
                curr++;
            else
                break;
        }
        res = max(res, curr);
    }
    return res;
}


//
int maxConnectiveOnes1(int arr[], int n) {
    int max_count = 0, curr_count = 0;

    for (int i = 0; i < n; i++) {
        if (arr[i] == 0) {
            curr_count = 0;
        } else {
            curr_count++;
            max_count = max(max_count, curr_count);
        }
    }

    return max_count;
}




int main() {
    bool arr[] = {0, 1, 1, 0, 1, 1, 1};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout << "Max Consecutive 1s: " << maxConsecutiveOnes(arr, n) << endl;
    cout << "Max Consecutive 1s: " << maxConsecutiveOnes1(arr, n) << endl;
    return 0;
}
