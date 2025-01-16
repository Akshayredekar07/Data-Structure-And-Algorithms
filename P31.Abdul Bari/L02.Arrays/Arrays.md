## **ARRAYS**

- **Scalar Variable:** Holds a single value.  
  Example: `int x = 10;` (scalar `x` stores one integer, 10).  

- **Array (Vector):** Holds multiple values of the same data type.  
  Example: `int A[5];` (array `A` can store 5 integers).  

- **Key Difference:**  
  - Scalar: Stores one value.  
  - Array: Stores multiple values under one variable name.  
```cpp
//Array Representation in Memory:
//Array Name: A
         ----------------------------------------
Index:   |  0   |   1   |   2   |   3   |   4   |
Value:   |      |       |  15   |       |       |
Address: | 200/1| 202/3 | 204/5 | 206/7 | 208/9 |
         ----------------------------------------
```
Details:
- **A:** Name of the array.
- **Indices (0, 1, 2, 3, 4):** Used to access array elements.
- **Value (15):** Stored at index 2 (`A[2] = 15`).
- **Addresses (200/1, 202/3, etc.):** Memory addresses with size of data type.

### **Decleration of array**

Array Declaration and Initialization in C/C++:

1. **`int A[5];`**
   - Declares an integer array `A` of size 5 (uninitialized; contains garbage values).

2. **`int A[5] = {2, 4, 6, 8, 10};`**
   - Declares and initializes `A` with values 2, 4, 6, 8, 10.

3. **`int A[5] = {2, 4};`**
   - Initializes first two elements (2, 4), remaining set to 0.

4. **`int A[5] = {0};`**
   - Initializes all elements to 0.

5. **`int A[] = {2, 4, 6, 8, 10, 12};`**
   - Compiler determines size (6) based on initial values.

**Note:**
- **Data Type:** Specifies element type (e.g., `int`, `float`, `char`).
- **Name:** Unique array name (e.g., `A`).
- **Size:** Defined in `[]`, optional if initializer is provided.
- **Initialization:** Optional, use `{}` for values.
- **Indexing:** Zero-based; first



### **Static vs. Dynamic Arrays in C/C++**

**Static Array:**
- **Declaration:** Fixed size at compile time.  
  Example: `int A[5];`
- **Memory Allocation:** On the **stack** during compile time.
- **Pros:**  
  - Easy to use.  
  - Fast access by index.  
- **Cons:**  
  - Fixed size leads to potential memory wastage or overflow.

**Dynamic Array:**
- **Declaration:** Size defined at runtime using:  
  - C: `int *B = (int*)malloc(n * sizeof(int));`  
  - C++: `int *B = new int[n];`
- **Memory Allocation:** On the **heap** during runtime.
- **Pros:**  
  - Flexible size, reduces memory wastage.  
- **Cons:**  
  - Complex management (manual allocation/deallocation).  
  - Risk of memory leaks if not handled properly.


#### **Memory Layout**

```cpp
+--------------------+
|       Heap         |
+--------------------+
| Dynamic Array B    |
| (Allocated at      |
| runtime)           |
+--------------------+
|       Stack        |
+--------------------+
| Static Array A     |
| (Fixed size)       |
| Local variables    |
+--------------------+
|       Code         |
+--------------------+
| Instructions       |
| (main function,    |
| other code)        |
+--------------------+
```

**Deallocation:**

- **C:** Use the `free` function to deallocate memory allocated with `malloc`.
    ```c
    free(B);
    ```
    This releases the memory back to the heap, making it available for future allocations.

- **C++:** Use the `delete[]` operator to deallocate memory allocated with `new[]`.
    ```cpp
    delete[] B;
    ```
**Important:** Always ensure that you only deallocate memory that was dynamically allocated. Deallocating memory that was not dynamically allocated or attempting to deallocate the same memory multiple times can lead to undefined behavior and program crashes.


### **2D Arrays**

```c
int A[3][4] = { 
    {1, 2, 3, 9}, 
    {249, 9, 57}, 
    {8, 9, 10, 18} 
};

A[1][2] = 15;
```

**Text Diagrams:**

**2D Array Representation:**

```c
     0    1    2    3
   +----+----+----+----+---+
0  |  1  |  2  |  3  |  9  |
   +----+----+----+----+---+
1  | 249 |  9  | 57  |  15 |  // A[1][2] is updated to 15
   +----+----+----+----+---+
2  |  8  |  9  | 10  | 18  |
   +----+----+----+----+---+
```

- The code declares a 2D integer array `A` with 3 rows and 4 columns.
- The array is initialized with the given values.
- The statement `A[1][2] = 15;` modifies the element at row 1, column 2 (second row, third column) to 15.


Certainly, let's provide the text diagram and Markdown representation for the given code and diagram:

**Text Diagram:**

```c
+--------------------+
|       A[0]         | ---> |   0  |   1  |   2  |   3  |
+--------------------+
|       A[1]         | ---> |   0  |   1  |  15  |   3  |
+--------------------+
|       A[2]         | ---> |   0  |   1  |   2  |   3  |
+--------------------+
```
```
A[0] → [Pointer to first array]
A[1] → [Pointer to second array]
A[2] → [Pointer to third array]
```

```c++
int *A[3];

A[0] = new int[4];
A[1] = new int[4];
A[2] = new int[4];

A[1][2] = 15;
```
### **Another Way to Create a 2D Array**

1. Declare a pointer to a pointer:
    ```cpp
    int **A;
    ```

2. Allocate memory for an array of pointers (rows):
    ```cpp
    A = new int*[3];
    ```

3. Allocate memory for each row (columns):
    ```cpp
    A[0] = new int[4];
    A[1] = new int[4];
    A[2] = new int[4];
    ```

This method dynamically allocates a 2D array with 3 rows and 4 columns.



Here's the code from the image:

```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int A[3][4] = {{1, 2, 3, 4}, {2, 4, 6, 8}, {1, 3, 5, 7}};

    int *B[3];
    int **C;

    B[0] = (int *)malloc(4 * sizeof(int));
    B[1] = (int *)malloc(4 * sizeof(int));
    B[2] = (int *)malloc(4 * sizeof(int));

    C = (int **)malloc(3 * sizeof(int *));
    C[0] = (int *)malloc(4 * sizeof(int));
    C[1] = (int *)malloc(4 * sizeof(int));
    C[2] = (int *)malloc(4 * sizeof(int));

    return 0;
}
```
1. **Initialization:**
   - `int A[3][4] = {{1, 2, 3, 4}, {2, 4, 6, 8}, {1, 3, 5, 7}};`: Declares and initializes a 2D array `A` with 3 rows and 4 columns.

2. **Pointer Declarations:**
   - `int *B[3];`: Declares an array `B` of 3 integer pointers. This will be used to create an array of pointers to rows.
   - `int **C;`: Declares a double pointer `C` which will be used to create an array of pointers to rows, similar to `B`.

3. **Memory Allocation for `B`:**
   - `B[0] = (int *)malloc(4 * sizeof(int));`: Allocates memory for an array of 4 integers and assigns the address to `B[0]`.
   - `B[1] = (int *)malloc(4 * sizeof(int));`: Allocates memory for another array of 4 integers and assigns the address to `B[1]`.
   - `B[2] = (int *)malloc(4 * sizeof(int));`: Allocates memory for a third array of 4 integers and assigns the address to `B[2]`.

4. **Memory Allocation for `C`:**
   - `C = (int **)malloc(3 * sizeof(int *));`: Allocates memory for an array of 3 integer pointers and assigns the address to `C`.
   - `C[0] = (int *)malloc(4 * sizeof(int));`: Allocates memory for an array of 4 integers and assigns the address to `C[0]`.
   - `C[1] = (int *)malloc(4 * sizeof(int));`: Allocates memory for another array of 4 integers and assigns the address to `C[1]`.
   - `C[2] = (int *)malloc(4 * sizeof(int));`: Allocates memory for a third array of 4 integers and assigns the address to `C[2]`.


Certainly, here's the text from the image in Markdown format, along with formulas and a text diagram:

**Text:**

**Arrays in Compilers**

```c
int A[5] = {3, 5, 8, 4, 2};
```

**Diagram:**

```cpp
     0    1    2    3    4
  +----+----+----+----+----+
A | 3  |  5 |  8 | 10 | 2  |
  +----+----+----+----+----+
    200  202  204  206  208
```

**Formulas:**

* `Addr(A[3]) = 200 + 3 * 2 = 206`
* `Addr(A[i]) = Lo + i * w` 
---

## Array Memory Representation and Address Calculation

### Memory Storage
In languages like C and C++, multi-dimensional arrays are stored in contiguous memory blocks using row-major order. This means:
- Elements of the first row are stored sequentially
- Followed by elements of the second row
- And so on for subsequent rows

Consider a 2D array `A[3][4]` (3 rows × 4 columns). With each element taking 2 bytes, the memory layout would be:

### Linear Representation
```
a[0][0] a[0][1] a[0][2] a[0][3] a[1][0] a[1][1] a[1][2] a[1][3] a[2][0] a[2][1] a[2][2] a[2][3]
```

### Visual Memory Map
```cpp
Row 0:   +-------+-------+-------+-------+
         |a[0][0]|a[0][1]|a[0][2]|a[0][3]|
         +-------+-------+-------+-------+

Row 1:   +-------+-------+-------+-------+
         |a[1][0]|a[1][1]|a[1][2]|a[1][3]|
         +-------+-------+-------+-------+

Row 2:   +-------+-------+-------+-------+
         |a[2][0]|a[2][1]|a[2][2]|a[2][3]|
         +-------+-------+-------+-------+                                                                    End Address
```

## Address Calculation
To find the memory address of any element A[i][j], use this formula (row-major order):

```cpp
Address(A[i][j]) = L₀ + (i * n + j) * w
```

Where:
- L₀ = Base address (starting point)
- i = Row index
- j = Column index
- n = Number of columns
- w = Element size in bytes

## Calculation Examples
Given: Base address L₀ = 200, element size w = 2 bytes

### Example 1: Finding A[1][2]
```plaintext
Address(A[1][2]) = 200 + (1 * 4 + 2) * 2
                 = 200 + (4 + 2) * 2
                 = 200 + 6 * 2
                 = 200 + 12
                 = 212
```

### Example 2: Finding A[2][3]
```plaintext
Address(A[2][3]) = 200 + (2 * 4 + 3) * 2
                 = 200 + (8 + 3) * 2
                 = 200 + 11 * 2
                 = 200 + 22
                 = 222
```

### Row-Major Order (C/C++ Style)
```
Memory Layout:
Index:    0    1    2    3    4    5    6    7    8    9    10   11
Address:  200  202  204  206  208  210  212  214  216  218  220  222
Element:  a₀₀  a₀₁  a₀₂  a₀₃  a₁₀  a₁₁  a₁₂  a₁₃  a₂₀  a₂₁  a₂₂  a₂₃
```

Visual Matrix Representation:
```
         Col 0   Col 1   Col 2   Col 3
         +-------+-------+-------+-------+
Row 0    | a₀₀   | a₀₁   | a₀₂   | a₀₃   |
         | 200   | 202   | 204   | 206   |
         +-------+-------+-------+-------+
Row 1    | a₁₀   | a₁₁   | a₁₂   | a₁₃   |
         | 208   | 210   | 212   | 214   |
         +-------+-------+-------+-------+
Row 2    | a₂₀   | a₂₁   | a₂₂   | a₂₃   |
         | 216   | 218   | 220   | 222   |
         +-------+-------+-------+-------+
```

### Row-Major Order
```
Address(A[i][j]) = L₀ + (i × n + j) × w

Where:
L₀ = Base address (200)
i = Row index
j = Column index
n = Number of columns (4)
w = Element size in bytes (2)
```

Example Calculations:
1. For A[1][2]:
```
Address(A[1][2]) = 200 + (1 × 4 + 2) × 2
                 = 200 + (4 + 2) × 2
                 = 200 + 6 × 2
                 = 200 + 12
                 = 212
```

2. For A[2][1]:
```
Address(A[2][1]) = 200 + (2 × 4 + 1) × 2
                 = 200 + (8 + 1) × 2
                 = 200 + 9 × 2
                 = 200 + 18
                 = 218
```

### Column-Major Order (Fortran Style)
```
Address(A[i][j]) = L₀ + (j × m + i) × w

Where:
m = Number of rows (3)
```

## Practical Implications
Understanding array memory representation is crucial for:
- Optimizing memory access patterns
- Improving cache utilization
- Debugging memory-related issues
- Writing efficient array manipulation algorithms

