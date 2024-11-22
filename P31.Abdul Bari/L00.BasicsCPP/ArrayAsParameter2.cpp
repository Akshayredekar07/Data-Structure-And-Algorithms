#include <stdio.h>
#include <stdlib.h>

// Function to allocate memory for an array dynamically
int* fun(int n) {
    int* P;
    P = (int*)malloc(n * sizeof(int)); // Allocating memory in the heap
    return P; // Returning the pointer to the allocated memory
}

int main() {
    int* A; // Pointer to hold the address of the array
    A = fun(5); // Allocate memory for an array of size 5

    // Example: Initialize and print values
    for (int i = 0; i < 5; i++) {
        A[i] = i + 1; // Assign values to the array
        printf("%d ", A[i]); // Print values
    }

    // Free the allocated memory
    free(A);

    return 0;
}

