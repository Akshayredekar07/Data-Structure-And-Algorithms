#include <iostream>
using namespace std;

// Function to dynamically allocate memory for an array
int* fun(int n) {
    int* P = new int[n]; // Allocate memory for an array of size 'n' in the heap
    return P; // Return the pointer to the allocated memory
}

int main() {
    int* A; // Pointer to hold the address of the array
    A = fun(5); // Call function to allocate memory for an array of size 5

    // Example: Initialize and print values
    for (int i = 0; i < 5; i++) {
        A[i] = i + 1; // Assign values to the array
        cout << A[i] << " "; // Print values
    }
    cout << endl;

    // Free the allocated memory
    delete[] A;

    return 0;
}

