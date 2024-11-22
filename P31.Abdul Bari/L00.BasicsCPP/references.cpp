#include <iostream>
using namespace std;

int main() {
    int a = 10;
    int &r = a; // Reference to `a`

    cout << "Value of a: " << a << endl; // Output: 10
    r++; // Increment `a` through reference
    cout << "Value of r: " << r << endl; // Output: 11
    cout << "Value of a: " << a << endl; // Output: 11

    int b = 25;
    r = b; // This assigns the value of `b` to `a` through the reference

    cout << "Value of r: " << r << endl; // Output: 25
    cout << "Value of a: " << a << endl; // Output: 25

    int c = 30;
    r = c;
    cout << "Value of r: " << r << endl; // Output: 
    cout << "Value of c: " << c << endl; // Output: 
    cout << "Value of a: " << a << endl; // Output: 

    return 0;
}
