#include <iostream>
using namespace std;

class Array {
private:
    int* A;       // Pointer to dynamic array
    int size;     // Maximum size of the array
    int length;   // Current number of elements

public:
    // Constructor to initialize the array
    Array(int size, int length, int elements[]) {
        this->size = size;
        this->length = length;
        A = new int[size]; // Dynamically allocate memory for the array
        for (int i = 0; i < length; i++) {
            A[i] = elements[i];
        }
    }

    // Destructor to free allocated memory
    ~Array() {
        delete[] A;
    }

    // Display the elements of the array
    void display() const {
        cout << "Elements are: ";
        for (int i = 0; i < length; i++) {
            cout << A[i] << " ";
        }
        cout << endl;
    }

    // Reverse using auxiliary array
    void reverseUsingAuxiliary() {
        int* B = new int[length];
        for (int i = length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }
        for (int i = 0; i < length; i++) {
            A[i] = B[i];
        }
        delete[] B; // Free memory of temporary array
    }

    // Reverse in-place
    void reverseInPlace() {
        int i = 0, j = length - 1;
        while (i < j) {
            swap(A[i], A[j]);
            i++;
            j--;
        }
    }
};

int main() {
    // Initialize array with elements
    int elements[] = {2, 3, 9, 16, 18, 21, 28, 32, 35};
    int size = 10;
    int length = 9;

    // Create an object of Array
    Array arr(size, length, elements);

    cout << "Original Array:" << endl;
    arr.display();

    // Reverse using auxiliary array
    arr.reverseUsingAuxiliary();
    cout << "\nReversed using auxiliary array:" << endl;
    arr.display();

    // Reverse back using in-place method
    arr.reverseInPlace();
    cout << "\nReversed back using in-place method:" << endl;
    arr.display();

    return 0;
}


/*
Class Definition:

A is a pointer to dynamically allocate memory for the array.
size holds the maximum size of the array.
length holds the current number of elements in the array.
Constructor:

Initializes the array by copying elements from the input array.
Dynamically allocates memory for the array.
Destructor:

Ensures the allocated memory is freed when the object is destroyed.
Methods:

display(): Prints the elements of the array.
reverseUsingAuxiliary(): Reverses the array using a temporary array.
reverseInPlace(): Reverses the array by swapping elements in place.
Main Function:

Creates an Array object with given elements.
Demonstrates both methods of reversing the array.
*/