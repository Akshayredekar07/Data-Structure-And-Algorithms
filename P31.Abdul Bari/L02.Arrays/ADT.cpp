#include <iostream>
using namespace std;

struct Array {
    int *A;
    int length;
    int size;
};

void Display(struct Array arr) {
    int i;
    printf("\nElements are\n");
    for (i = 0; i < arr.length; i++) {
        printf("%d ", arr.A[i]);
    }
    printf("\n");
}

int main() {
    struct Array arr;
    int n, i;
    printf("Enter the size of array: ");
    scanf("%d", &arr.size);
    arr.A = (int *)malloc(arr.size * sizeof(int));
    arr.length = 0;

    printf("Enter number of elements: ");
    scanf("%d", &n);
    arr.length = n;

    printf("Enter the elements:\n");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr.A[i]);
    }

    Display(arr);

    free(arr.A);
    return 0;
}