// #include <iostream>
// using namespace std;

// class Rectangle {
// private:
//     int length;
//     int breadth;

// public:
//     // Default constructor
//     Rectangle() {
//         length = 1;
//         breadth = 1;
//     }

//     // Parameterized constructor
//     Rectangle(int l, int b) {
//         length = l;
//         breadth = b;
//     }

//     // Member function to calculate area
//     int area() {
//         return length * breadth;
//     }

//     // Member function to calculate perimeter
//     int perimeter() {
//         return 2 * (length + breadth);
//     }

//     // Getter for length
//     int getLength() {
//         return length;
//     }

//     // Setter for length
//     void setLength(int l) {
//         length = l;
//     }

//     // Destructor
//     ~Rectangle() {
//         // Optional destructor body (automatically called)
//     }
// };

// int main() {
//     Rectangle r(10, 5); // Create an object of Rectangle with initial values
//     cout << r.area() << endl;           // Print area
//     cout << r.perimeter() << endl;      // Print perimeter
//     r.setLength(20);                    // Change the length
//     cout << r.getLength() << endl;      // Print the updated length

//     return 0;
// }



#include <iostream>
using namespace std;

class Rectangle {
private:
    int length;
    int breadth;

public:
    // Default constructor
    Rectangle();

    // Parameterized constructor
    Rectangle(int l, int b);

    // Member function to calculate area
    int area();

    // Member function to calculate perimeter
    int perimeter();

    // Getter for length
    int getLength();

    // Setter for length
    void setLength(int l);

    // Destructor
    ~Rectangle();
};

// Default constructor implementation
Rectangle::Rectangle() {
    length = 1;
    breadth = 1;
}

// Parameterized constructor implementation
Rectangle::Rectangle(int l, int b) {
    length = l;
    breadth = b;
}

// Function to calculate area
int Rectangle::area() {
    return length * breadth;
}

// Function to calculate perimeter
int Rectangle::perimeter() {
    return 2 * (length + breadth);
}

// Getter for length
int Rectangle::getLength() {
    return length;
}

// Setter for length
void Rectangle::setLength(int l) {
    length = l;
}

// Destructor
Rectangle::~Rectangle() {
    // Optional cleanup if needed
}

int main() {
    Rectangle r(10, 5); // Create an object of Rectangle with initial values
    cout << r.area() << endl;           // Print area
    cout << r.perimeter() << endl;      // Print perimeter
    r.setLength(20);                    // Change the length
    cout << r.getLength() << endl;      // Print the updated length

    return 0;
}
