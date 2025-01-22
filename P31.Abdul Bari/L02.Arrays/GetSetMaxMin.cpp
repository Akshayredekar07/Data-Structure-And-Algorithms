
#include <iostream>
using namespace std;

// Define the Array class
class Array {
private:
    int A[10];  // Static array with a capacity of 10
    int size;   // Maximum size of the array
    int length; // Current number of elements in the array

public:
    // Constructor to initialize the array
    Array(int arr[], int size, int length) {
        this->size = size;
        this->length = length;
        // Uses the -> operator to access members of the structure through a pointer.
        for (int i = 0; i < length; i++) {
            A[i] = arr[i];
        }
    }

    // Function to display the elements of the array
    void Display() const {
        cout << "\nElements are: ";
        for (int i = 0; i < length; i++) {
            cout << A[i] << " ";
        }
        cout << endl;
    }

    // Function to get the element at a given index
    int Get(int index) const {
        if (index >= 0 && index < length) {
            return A[index];
        }
        return -1; // Return -1 for an invalid index
    }

    // Function to set the value at a given index
    void Set(int index, int value) {
        if (index >= 0 && index < length) {
            A[index] = value;
        }
    }

    // Function to find the maximum element in the array
    int Max() const {
        int max = A[0];
        for (int i = 1; i < length; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }

    // Function to find the minimum element in the array
    int Min() const {
        int min = A[0];
        for (int i = 1; i < length; i++) {
            if (A[i] < min) {
                min = A[i];
            }
        }
        return min;
    }

    // Function to calculate the sum of all elements in the array
    int Sum() const {
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += A[i];
        }
        return sum;
    }

    // Function to calculate the average of the array elements
    float Avg() const {
        return static_cast<float>(Sum()) / length;
    }

    // Function to swap two elements in the array
    void Swap(int index1, int index2) {
        if (index1 >= 0 && index1 < length && index2 >= 0 && index2 < length) {
            int temp = A[index1];
            A[index1] = A[index2];
            A[index2] = temp;
        }
    }
};

int main() {
    // Initialize the array
    int elements[] = {2, 3, 9, 16, 18, 21, 28, 32, 35};
    Array arr(elements, 10, 9);

    // Display the sum of elements
    cout << "Sum: " << arr.Sum() << endl;

    // Display the elements in the array
    arr.Display();

    // Example usage of other functions
    cout << "Element at index 2: " << arr.Get(2) << endl;

    arr.Set(2, 100);
    cout << "Updated element at index 2: " << arr.Get(2) << endl;

    cout << "Maximum element: " << arr.Max() << endl;
    cout << "Minimum element: " << arr.Min() << endl;
    cout << "Average: " << arr.Avg() << endl;

    // Swap two elements
    arr.Swap(2, 4);
    cout << "Array after swapping elements at index 2 and 4:";
    arr.Display();

    return 0;
}
