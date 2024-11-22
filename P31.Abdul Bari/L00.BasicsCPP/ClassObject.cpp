#include <iostream>

using namespace std;

class Rectangle {
public:
    int length;
    int breadth;

    // Constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Member function to calculate area
    int area() {
        return length * breadth;
    }

    // Member function to change length
    void changeLength(int l) {
        length = l;
    }
};

int main() {
    Rectangle r(10, 5);

    cout << "Area: " << r.area() << endl;

    r.changeLength(20);
    cout << "New Area: " << r.area() << endl;

    return 0;
}