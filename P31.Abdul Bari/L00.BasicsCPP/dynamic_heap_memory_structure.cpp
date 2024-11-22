#include <iostream> 
#include <stdio.h>
#include <stdlib.h>
using namespace std;

struct Rectangle {
    int length;
    int breadth;
};

int main() {
    // Declare a pointer to Rectangle
    Rectangle *p;

    // Allocate memory for a Rectangle object dynamically in the heap
    p = (struct Rectangle *)malloc(sizeof(struct Rectangle)); // C-Style
    //p = new Rectangle; // C++ style

    // Assign values to the members using the pointer
    p->length = 10;
    p->breadth = 5;

    // Print the values
    cout << "Length: " << p->length << endl;
    cout << "Breadth: " << p->breadth << endl;

    // Free the allocated memory
    delete p;

    return 0;
}

