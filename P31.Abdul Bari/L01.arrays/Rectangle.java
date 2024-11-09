public class Rectangle {
    int length;
    int breadth;
    char x;

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 10;
        r1.breadth = 5;

        r1.length = 15;
        r1.breadth = 7;

        System.out.println(r1.length);
        System.out.println(r1.breadth);
    }
}

/*
#include <iostream>

using namespace std;

struct Rectangle {
    int length;
    int breadth;
    char x;
};

int main() {
    struct Rectangle r1 = {10, 5};

    r1.length = 15;
    r1.breadth = 7;

    cout << r1.length << endl;
    cout << r1.breadth << endl;

    return 0;
}
    

#include <stdio.h>

struct Rectangle {
    int length;
    int breadth;
    char x;
};

int main() {
    struct Rectangle r1 = {10, 5};

    // Modify the values
    r1.length = 15;
    r1.breadth = 7;

    // Print the values
    printf("Length: %d\n", r1.length);
    printf("Breadth: %d\n", r1.breadth);

    return 0;
}
    
class Rectangle:
    def __init__(self, length, breadth, x):
        self.length = length
        self.breadth = breadth
        self.x = x

    def print_dimensions(self):
        print("Length:", self.length)
        print("Breadth:", self.breadth)

r1 = Rectangle(10, 5, 'A')

# Modify the values
r1.length = 15
r1.breadth = 7

# Print the values
r1.print_dimensions()
*/


