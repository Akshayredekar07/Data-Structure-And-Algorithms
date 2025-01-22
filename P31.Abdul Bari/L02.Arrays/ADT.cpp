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

void Append(struct Array *arr, int x) {
    if (arr->length < arr->size) {
        arr->A[arr->length++] = x;
    } else {
        printf("Array is full, cannot append.\n");
    }
}

void Insert(struct Array *arr, int index, int x) {
    if (index >= 0 && index <= arr->length) {
        for (int i = arr->length; i > index; i--) {
            arr->A[i] = arr->A[i - 1];
        }
        arr->A[index] = x;
        arr->length++;
    } else {
        printf("Invalid index, cannot insert.\n");
    }
}

void Delete(struct Array *arr, int index) {
    if (index >= 0 && index < arr->length) {
        for (int i = index; i < arr->length - 1; i++) {
            arr->A[i] = arr->A[i + 1];
        }
        arr->length--;
    } else {
        printf("Invalid index, cannot delete.\n");
    }
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

    // Example usage of Append and Insert
    Append(&arr, 10);
    Display(arr);

    Insert(&arr, 2, 20);
    Display(arr);

    free(arr.A);
    return 0;
}