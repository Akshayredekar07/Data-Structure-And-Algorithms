#include <iostream>
#include <vector>
using namespace std;

// Function to merge two sorted arrays
vector<int> mergeArrays(const vector<int>& A, const vector<int>& B) {
    int i = 0, j = 0;
    vector<int> C;

    // Merge elements from both arrays
    while (i < A.size() && j < B.size()) {
        if (A[i] < B[j])
            C.push_back(A[i++]);
        else
            C.push_back(B[j++]);
    }

    // Copy remaining elements from A
    while (i < A.size())
        C.push_back(A[i++]);

    // Copy remaining elements from B
    while (j < B.size())
        C.push_back(B[j++]);

    return C;
}

// Driver Code
int main() {
    vector<int> A = {2, 9, 21, 28, 35};
    vector<int> B = {2, 3, 16, 18, 28};

    vector<int> C = mergeArrays(A, B);

    // Print merged array
    cout << "Merged Array: ";
    for (int num : C)
        cout << num << " ";
    cout << endl;

    return 0;
}
