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



### Array Abstract Data Type (ADT) Concepts

#### 1. **Array Space/Storage:**
- **Size (Capacity):** The maximum number of elements an array can hold. In the example, the size is fixed at **10**.
- **Length:** The number of elements currently stored in the array. In the example, the length is **7** (indicating 7 elements are stored).
- **Data Section:** This section shows the elements stored in the array: **8, 3, 7, 12, 6, 9, 10**.
- **Indices:** The indices of the array elements are labeled from **0 to 9**.

#### 2. **Key Properties:**
- **Size:** Maximum number of elements an array can hold, which is fixed.
  - Example: **Size = 10**
- **Length:** The current number of elements stored in the array, which is dynamic.
  - Example: **Length = 7**

#### 3. **Common Operations:**
- **Display():** Displays all the elements in the array.
- **Add(x) / Append(x):** Adds the element **x** to the end of the array.
  - Logic: `A[Length] = x; Length++;`
  - Time Complexity: **O(1)** (constant time) for the operation.
- **Insert(index, x):** Inserts element **x** at a specific index, which typically requires shifting the elements after the insertion point.
- **Delete(index):** Deletes the element at the specified index, which may also require shifting the elements after the deleted item.
- **Search(x):** Searches for the element **x** in the array.
- **Get(index):** Retrieves the element at the specified index.
- **Set(index, x):** Sets the value at a specific index to **x**.
- **Max() / Min():** Finds the maximum or minimum element in the array.
- **Reverse():** Reverses the order of the elements in the array.
- **Shift/Rotate():** Shifts or rotates the elements in the array.



    ```
    Array A (Size = 10, Length = 8)

    +---+---+---+----+---+---+---+----+---+---+
    | 8 | 3 | 7 | 12 | 15| 6 | 9 | 10 |   |   |
    +---+---+---+----+---+---+---+----+---+---+
    | 0 | 1 | 2 |  3 | 4 | 5 | 6 |  7 | 8 | 9 |  <-- Index
    ```




   **Insert(index, x):** Inserts element `x` at the specified `index`. Elements from that index onwards are shifted to the right.

        ```
        Before Insertion:
        +---+---+---+----+---+---+---+----+---+---+
        | 8 | 3 | 7 | 12 |   | 6 | 9 | 10 |   |   |
        +---+---+---+----+---+---+---+----+---+---+
        | 0 | 1 | 2 |  3 | 4 | 5 | 6 |  7 | 8 | 9 |

        After Insertion:
        +---+---+---+----+----+---+---+----+---+---+
        | 8 | 3 | 7 | 12 | 15 | 6 | 9 | 10 |   |   |
        +---+---+---+----+----+---+---+----+---+---+
        | 0 | 1 | 2 |  3 |  4 | 5 | 6 |  7 | 8 | 9 |
        ```


**Array ADT - Delete Operation**

*   **Initial State:**
    *   `Size = 10` (Array capacity)
    *   `Length = 8` (Number of elements currently in the array)
    *   Array `A`: `[8, 3, 7, 12, 15, 6, 9, 10, _, _]` (Indices 0-9)

*   **Operation:** `Delete(3)` (Delete the element at index 3)

*   **Code/Steps (from the image, adapted for 0-based indexing):**

    1.  `x = A[index];` (Store the value at the index to be deleted. In this case, `x` would become 12.)
    2.  `for (i = index; i < Length - 1; i++) { A[i] = A[i + 1]; }` (Shift elements to the left, starting from the deletion index up to `Length-1`)
    3.  `Length--;` (Decrement the length of the array)

*   **Visual Representation (Before Deletion):**

    ```
    +---+---+---+----+----+---+---+----+---+---+
    | 8 | 3 | 7 | 12 | 15 | 6 | 9 | 10 |   |   |
    +---+---+---+----+----+---+---+----+---+---+
    | 0 | 1 | 2 |  3 |  4 | 5 | 6 |  7 | 8 | 9 |  <-- Index
    ```

*   **Visual Representation (After Deletion):**

    ```
    +---+---+---+----+---+---+----+---+---+---+
    | 8 | 3 | 7 | 15 | 6 | 9 | 10 |   |   |   |
    +---+---+---+----+---+---+----+---+---+---+
    | 0 | 1 | 2 |  3 | 4 | 5 |  6 | 7 | 8 | 9 |  <-- Index
    ```

**Array Delete Time Complexity**

*   **Best Case (Deleting last element):** O(1) - Constant time.
*   **Worst/Average Case (Deleting elsewhere):** O(n) - Linear time (due to shifting).


**Linear Search in an Array**

*   **Array:**
    *   `Size = 10` (Capacity)
    *   `Length = 10` (Number of elements)
    *   `A = [8, 9, 4, 7, 6, 3, 10, 5, 14, 2]` (Elements at indices 0-9)

*   **Search Operation:** The code performs a linear search for a given `Key`.

    ```c
    for (i = 0; i < Length; i++) {
        if (key == A[i]) {
            return i; // Key found at index i
        }
    }
    return -1; // Key not found
    ```

*   **Successful Search:**
    *   `Key = 5`
    *   The search finds `5` at index 7.

*   **Unsuccessful Search:**
    *   `Key = 12`
    *   The search does not find `12` in the array.

*   **Time Complexity:**
    *   **Best Case:** O(1) (Key is at the first index).
    *   **Worst Case:** O(n) (Key is at the last index or not present).
    *   **Average Case:** O(n)


    *   Calculating the average case time complexity as `1+2+3+--+(n+1)/2 = n+1/2`, which simplifies to O(n). This is a correct, though slightly informal, way to arrive at the average case complexity.


### **1. Binary Search Algorithm**
Binary search works by halving the search space at every step:
1. Compare the middle element of the array with the target.
2. If the middle element is the target, stop.
3. If the target is smaller than the middle element, repeat the search on the left half.
4. If the target is larger, repeat the search on the right half.

At each step, the number of elements left to search is halved.

### **2. General Analysis**
Suppose the array has $n$ elements.

1. **Initial Search Space**: $n$ elements.
2. After the first comparison, the search space reduces to $\frac{n}{2}$ elements.
3. After the second comparison, it reduces to $\frac{n}{4}$ elements.
4. After $k$ comparisons, the search space is reduced to:
  $$
  \frac{n}{2^k}
  $$

This process continues until the search space contains only 1 element.

### **3. Deriving the Formula**
The condition to stop is when the search space contains 1 element:
$$
\frac{n}{2^k} = 1
$$

Solve for $k$:
$$
n = 2^k
$$

Take the logarithm (base 2) on both sides:
$$
\log_2(n) = k
$$

Thus, the number of steps $k$, which is the number of comparisons required, is:
$$
k = \log_2(n)
$$

### **4. Time Complexity**
- In terms of **Big-O notation**, the time complexity is proportional to $\log_2(n)$.
- Since logarithmic time complexities grow very slowly as $n$ increases, binary search is efficient.

### **5. Example Calculation**
Let’s take an example with $n = 16$:
1. At step 1, search space: $16$.
2. At step 2, search space: $\frac{16}{2} = 8$.
3. At step 3, search space: $\frac{8}{2} = 4$.
4. At step 4, search space: $\frac{4}{2} = 2$.
5. At step 5, search space: $\frac{2}{2} = 1$.

The total steps = $\log_2(16) = 4$, confirming the formula.

### **Conclusion**
The formula $\log_2(n)$ arises naturally from the process of repeatedly halving the search space. Each division by 2 corresponds to one comparison, and the total number of divisions required is logarithmic with respect to the size of the input array.

### Breakdown of the Analysis:
1. **Best Case**: 
  - The best case occurs when the target element is found at the first comparison (i.e., the middle element). 
  - Time complexity: $O(1)$, as it only requires one comparison.

2. **Worst Case**:
  - In the worst case, the target element is either at the extreme ends or not in the array.
  - The number of comparisons required will be proportional to $\log_2(n)$, as binary search divides the array size by 2 at every step.
  - Time complexity: $O(\log n)$.

3. **Average Case**:
  - The average case is calculated by considering all possible paths in the binary tree representation of binary search.
  - Each level of the tree represents the halving of the search space.
  - The formula used:
    $$
    \text{Average Comparisons} = \frac{1 \cdot 2^0 + 2 \cdot 2^1 + 3 \cdot 2^2 + \cdots + \log_2(n) \cdot 2^{\log_2(n)-1}}{n}
    $$
  - This simplifies to:
    $$
    \frac{\log_2(n) \cdot n}{n} = O(\log n)
    $$

### Tree Representation:
- The image shows how the binary search process can be visualized as a binary tree.
- The root represents the full array, and each subsequent level halves the size of the array.

### Formula Simplifications:
- The summation ($\sum_{i=1}^{\log_2(n)} i \cdot 2^i$) in the image demonstrates how to compute the average case.
- After simplifying, it confirms that the average case complexity is also $O(\log n)$.
