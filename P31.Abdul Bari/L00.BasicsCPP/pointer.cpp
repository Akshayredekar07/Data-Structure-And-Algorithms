
#include <iostream>

using namespace std;


struct Rectangle {
    int length;
    int width;
};

int main() {
    // Example of pointer initialization and dereferencing in C++
    /*
    int a = 10;
    // int *p = &a; // Initialize pointer p with the address of a
    int *p; // Initialization only
    p = &a; // Assignment 
    cout << "Value of a: " << a << endl;
    printf("Using pointer: %d, Address of a: %d\n", *p, &a); 
    // Dereference p to get the value of a and print the address of a

    // For initialization and dereferencing use * 
    // For assignment don't use * 
    */

    // Array created in stack
    int A[5] = {1, 2, 3, 4, 5}; 
    int *p;
    p = A; // Pointing p to the array A

    // Print array elements using pointer
    for(int i = 0; i < 5; i++) {
        // cout << A[i] << endl; // C-style array access
        cout << p[i] << endl; // Pointer access
    }

    // Array created in heap using pointer in C
    // int *q;
    // q = (int *)malloc(5 * sizeof(int));
    // free(q);

    // Array created in heap using pointer in C++
    int *q;
    q = new int[5]; // Use new instead of malloc
    p[0] = 10; p[1] = 20; p[2] = 15; p[3] = 40; p[4] = 50; // Assigning values to the array

    // Print array elements using pointer
    for(int i = 0; i < 5; i++) {
        cout << p[i] << endl; // Pointer access
    }
    
    delete[ ] q; // Freeing the allocated memory


    int *p1;
    char *p2;
    float *p3;
    double p4;
    Rectangle *p5;

    cout << sizeof(p1) << endl;
    cout << sizeof(p2) << endl;
    cout << sizeof(p3) << endl;
    cout << sizeof(p4) << endl;
    cout << sizeof(p5) << endl;


    return 0;
}
