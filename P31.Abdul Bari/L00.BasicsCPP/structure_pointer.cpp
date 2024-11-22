#include <iostream>
using namespace std;

struct Rectangle {
    int length;
    int breadth;
};

int main() {
    struct Rectangle r = {10, 5}; // Create a Rectangle struct with length 10 and breadth 5
    
    cout<<r.length<<endl;
    cout<<r.breadth<<endl;

    struct Rectangle *p = &r; // Create a pointer p to the Rectangle struct r
    

    // Accessing and modifying members using the pointer
    p->length = 20; // Set the length of the Rectangle to 20
    p->breadth = 15; // Set the breadth of the Rectangle to 15

    // Printing the modified values
    cout << "Length: " << p->length <<endl;
    cout << "Breadth: " << p->breadth << endl;

    return 0;
}
