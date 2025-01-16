#include <stdio.h>

// Recursive method (O(n^2) approach)
double calculateExponentialRecursive(int x, int n) {
    static double numerator = 1, denominator = 1;
    double result;

    if (n == 0) {
        return 1;
    }
    result = calculateExponentialRecursive(x, n - 1);
    numerator *= x;
    denominator *= n;
    return result + numerator / denominator;
}

// Optimized recursive method (O(n) approach - using Horner's rule)
double calculateExponentialHorner(int x, int n) {
    static double sum = 1;

    if (n == 0) {
        return sum;
    }
    sum = 1 + (double)x * sum / n;
    return calculateExponentialHorner(x, n - 1);
}

// Iterative method
double calculateExponentialIterative(int x, int n) {
    double sum = 1;
    double numerator = 1;
    double denominator = 1;

    for (int i = 1; i <= n; i++) {
        numerator *= x;
        denominator *= i;
        sum += numerator / denominator;
    }
    return sum;
}

int main() {
    int x = 1, n = 10;

    printf("Using recursive method (O(n^2)): %lf\n", calculateExponentialRecursive(x, n));
    printf("Using optimized recursive method (O(n)): %lf\n", calculateExponentialHorner(x, n));
    printf("Using iterative method: %lf\n", calculateExponentialIterative(x, n));

    return 0;
}
