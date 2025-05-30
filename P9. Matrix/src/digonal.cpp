#include <stdio.h>

// Get function: Retrieve element at position (i, j)
int get(int A[5], int i, int j)
{
    if (i == j)
        return A[i];  // Return diagonal element A[i]
    return 0;         // Return 0 for off-diagonal elements
}

// Set function: Set element at position (i, j) to value
int set(int A[5], int i, int j, int value)
{
    if (i == j)
    {
        A[i] = value;  // Set diagonal element A[i] to value
        return 1;      // Success
    }
    return 0;          // No effect for off-diagonal elements
}

// Main function to demonstrate usage
int main()
{
    int A[5] = {3, 7, 4, 9, 6};  // Initial diagonal elements
    
    // Test get function
    printf("get(A, 0, 0) = %d\n", get(A, 0, 0));  // Output: 3
    printf("get(A, 1, 1) = %d\n", get(A, 1, 1));  // Output: 7
    printf("get(A, 2, 3) = %d\n", get(A, 2, 3));  // Output: 0
    
    // Test set function
    printf("set(A, 0, 0, 8) = %d\n", set(A, 0, 0, 8));  // Output: 1, A[0] = 8
    printf("New A[0] = %d\n", get(A, 0, 0));            // Output: 8
    printf("set(A, 1, 2, 5) = %d\n", set(A, 1, 2, 5));  // Output: 0, no change
    printf("set(A, 2, 2, 10) = %d\n", set(A, 2, 2, 10)); // Output: 1, A[2] = 10
    printf("New A[2] = %d\n", get(A, 2, 2));            // Output: 10
    
    return 0;
}