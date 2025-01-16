#include <stdio.h>
#include <stdlib.h>

int main() {
    // Static 2D array
    int A[3][4] = {{1, 2, 3, 4}, {2, 4, 6, 8}, {1, 3, 5, 7}};

    // Dynamic array using array of pointers
    int *B[3];
    for (int i = 0; i < 3; i++) {
        B[i] = (int *)malloc(4 * sizeof(int));
        if (B[i] == NULL) {
            printf("Memory allocation failed for B[%d]\n", i);
            return 1;
        }
        for (int j = 0; j < 4; j++) {
            B[i][j] = i + j; // Example initialization
        }
    }

    // Dynamic array using double pointer
    int **C = (int **)malloc(3 * sizeof(int *));
    if (C == NULL) {
        printf("Memory allocation failed for C\n");
        return 1;
    }
    for (int i = 0; i < 3; i++) {
        C[i] = (int *)malloc(4 * sizeof(int));
        if (C[i] == NULL) {
            printf("Memory allocation failed for C[%d]\n", i);
            return 1;
        }
        for (int j = 0; j < 4; j++) {
            C[i][j] = i * j; // Example initialization
        }
    }

    // Print static array
    printf("Static Array A:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            printf("%d ", A[i][j]);
        }
        printf("\n");
    }

    // Print dynamic array B
    printf("\nDynamic Array B:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            printf("%d ", B[i][j]);
        }
        printf("\n");
    }

    // Print dynamic array C
    printf("\nDynamic Array C:\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            printf("%d ", C[i][j]);
        }
        printf("\n");
    }

    // Free allocated memory
    for (int i = 0; i < 3; i++) {
        free(B[i]); // Free rows of B
    }

    for (int i = 0; i < 3; i++) {
        free(C[i]); // Free rows of C
    }
    free(C); // Free the array of pointers for C

    return 0;
}
