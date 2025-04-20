function mergeSortedArrays(A, B) {
    let i = 0, j = 0;
    let C = [];

    // Merge elements from both arrays
    while (i < A.length && j < B.length) {
        if (A[i] < B[j]) {
            C.push(A[i++]);
        } else {
            C.push(B[j++]);
        }
    }

    // Copy remaining elements from A
    while (i < A.length) C.push(A[i++]);

    // Copy remaining elements from B
    while (j < B.length) C.push(B[j++]);

    return C;
}

// Example usage
const A = [2, 9, 21, 28, 35];
const B = [2, 3, 16, 18, 28];

const C = mergeSortedArrays(A, B);
console.log("Merged Array:", C);
