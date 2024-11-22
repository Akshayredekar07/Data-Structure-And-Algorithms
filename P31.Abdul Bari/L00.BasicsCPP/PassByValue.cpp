#include <iostream>
using namespace std;

void swap(int x, int y) {
    int temp;
    temp = x;
    x = y;
    y = temp;
}

int main() {
    int a, b;
    a = 10;
    b = 20;

    cout << "Before swap: a = " << a << ", b = " << b << endl;

    // Call swap function
    swap(a, b);

    cout << "After swap: a = " << a << ", b = " << b << endl;

    return 0;
}

