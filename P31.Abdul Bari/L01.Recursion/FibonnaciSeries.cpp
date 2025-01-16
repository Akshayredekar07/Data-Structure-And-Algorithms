#include <iostream>
using namespace std;

// Iterative Fibonacci function
int fib(int n) {
    int t0 = 0, t1 = 1, sum, i;
    if (n <= 1) {
        return n;
    }

    for (i = 2; i <= n; i++) {
        sum = t0 + t1;
        t0 = t1;
        t1 = sum;
    }
    return sum;
}

// Recursive Fibonacci function
int rfib(int n) {
    if (n <= 1) {
        return n;
    }
    return rfib(n - 2) + rfib(n - 1);
}

// Memoized Fibonacci function
int F[100]; // Adjust size for larger inputs
int mfib(int n) {
    if (n <= 1) {
        F[n] = n;
        return n;
    }

    if (F[n - 2] == -1) {
        F[n - 2] = mfib(n - 2);
    }
    if (F[n - 1] == -1) {
        F[n - 1] = mfib(n - 1);
    }
    F[n] = F[n - 2] + F[n - 1];
    return F[n];
}

int main() {
    // Initialize the memoization array with -1
    for (int i = 0; i < 100; i++) {
        F[i] = -1;
    }

    int num = 10;

    int iterativeResult = fib(num);
    cout << "Iterative Fibonacci number at position " << num << " is: " << iterativeResult << endl;

    int recursiveResult = rfib(num);
    cout << "Recursive Fibonacci number at position " << num << " is: " << recursiveResult << endl;

    int memoizedResult = mfib(num);
    cout << "Memoized Fibonacci number at position " << num << " is: " << memoizedResult << endl;

    return 0;
}
