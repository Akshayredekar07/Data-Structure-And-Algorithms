#include <iostream>
using namespace std;

// Factorial function
int fact(int n) {
    if (n <= 1) {
        return 1;
    }
    return fact(n - 1) * n;
}

// Combinations using factorials
int nCr(int n, int r) {
    if (n == r || r == 0) {
        return 1;
    }
    int num = fact(n);
    int den = fact(r) * fact(n - r);
    return num / den;
}

// Recursive combinations using Pascal's Triangle
int NCR(int n, int r) {
    if (n == r || r == 0) {
        return 1;
    }
    return NCR(n - 1, r - 1) + NCR(n - 1, r);
}

// Memoized version of recursive combinations
int memo[100][100]; // Adjust size as needed
int NCRMemo(int n, int r) {
    if (n == r || r == 0) {
        return 1;
    }
    if (memo[n][r] != -1) {
        return memo[n][r];
    }
    memo[n][r] = NCRMemo(n - 1, r - 1) + NCRMemo(n - 1, r);
    return memo[n][r];
}

int main() {
    // Initialize memoization array with -1
    for (int i = 0; i < 100; i++) {
        for (int j = 0; j < 100; j++) {
            memo[i][j] = -1;
        }
    }

    // Testing the functions
    cout << "nCr using factorials (5, 3): " << nCr(5, 3) << endl;
    cout << "nCr using factorials (6, 2): " << nCr(6, 2) << endl;

    cout << "nCr using recursion (6, 2): " << NCR(6, 2) << endl;

    cout << "nCr using memoized recursion (6, 2): " << NCRMemo(6, 2) << endl;
    cout << "nCr using memoized recursion (10, 4): " << NCRMemo(10, 4) << endl;

    return 0;
}


/*
NCR(6, 2)
├── NCR(5, 1)
│   ├── NCR(4, 0) = 1
│   └── NCR(4, 1)
│       ├── NCR(3, 0) = 1
│       └── NCR(3, 1)
│           ├── NCR(2, 0) = 1
│           └── NCR(2, 1)
│               ├── NCR(1, 0) = 1
│               └── NCR(1, 1) = 1
├── NCR(5, 2)
│   ├── NCR(4, 1)
│   │   ├── NCR(3, 0) = 1
│   │   └── NCR(3, 1)
│   │       ├── NCR(2, 0) = 1
│   │       └── NCR(2, 1)
│   │           ├── NCR(1, 0) = 1
│   │           └── NCR(1, 1) = 1
│   └── NCR(4, 2)
│       ├── NCR(3, 1)
│       │   ├── NCR(2, 0) = 1
│       │   └── NCR(2, 1)
│       │       ├── NCR(1, 0) = 1
│       │       └── NCR(1, 1) = 1
│       └── NCR(3, 2)
│           ├── NCR(2, 1)
│           │   ├── NCR(1, 0) = 1
│           │   └── NCR(1, 1) = 1
│           └── NCR(2, 2) = 1

*/