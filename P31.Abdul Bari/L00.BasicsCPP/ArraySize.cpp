#include <iostream>
using namespace std;


void fun(int A[], int n) {
    cout << "Length of the array inside fun(): " << n << endl;
    for (int i = 0; i < n; i++) {
        cout << A[i] << " ";
    }
}

int main() {
    int A[] = {2, 4, 6, 8, 10};
    int n = sizeof(A) / sizeof(int); 
    fun(A, n); 
    cout << "Length of the array in main(): " << n << endl;

    for (int i = 0; i < n; i++) {
        cout << A[i] << " ";
    }
    cout<<endl;

    return 0;
}

