#include <stdio.h>

int main(){

// 1. Declare an integer array of size 5 (uninitialized)
int A[5];

// 2. Declare and initialize an integer array with specific values
int B[5] = {2, 4, 6, 8, 10};

// 3. Initialize only the first two elements, remaining set to 0
int C[5] = {2, 4};

// 4. Initialize all elements to 0
int D[5] = {0};

// 5. Let the compiler determine the size based on initializer values
int E[] = {2, 4, 6, 8, 10, 12};

int F[5] = {2, 4, 6, 8, 10};

// Print the values and their corresponding memory addresses
printf("Index\tAddress\t\tValue\n");
printf("---------------------------------\n");

for (int i = 0; i < 5; i++) {
    printf("%d\t%p\t%d\n", i, (void*)&F[i], F[i]);
}

return 0;
}
 