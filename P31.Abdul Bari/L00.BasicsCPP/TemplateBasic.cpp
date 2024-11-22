#include <iostream>

using namespace std;

template <class T>
class Arithmetic {
public:
    T a, b;

    Arithmetic(T x, T y) {
        a = x;
        b = y;
    }

    T add() {
        return a + b;
    }

    T sub() {
        return a - b;
    }
};

int main() {
    Arithmetic<int> ar(10, 5);
    cout << "Addition: " << ar.add() << endl;
    cout << "Subtraction: " << ar.sub() << endl;

    Arithmetic<float> arf(15.5, 13.2);
    cout << "Addition: " << arf.add() << endl;
    cout << "Subtraction: " << arf.sub() << endl;

    return 0;
}
