#include <iostream>

using namespace std;

void fun(int *A, int n) {
	A[0] = 44;
    for (int i = 0; i < n; i++) {
        cout << A[i] << " ";
    }
    cout << endl;
}

int main() {
    int A[5] = {2, 4, 6, 8, 10};

    fun(A, 5);

    return 0;
}

// Array are passed as pass by address, 
// hence it if modfication done in fromal parameter also reflect in actual parameter
