
#include <stdio.h>

void findDuplicatesCompare(char A[]) {
    int i, j;
    for (i = 0; A[i] != '\0'; i++) {
        for (j = i + 1; A[j] != '\0'; j++) {
            if (A[i] == A[j]) {
                printf("Duplicate found: %c\n", A[i]);
                break;
            }
        }
    }
    // Dry Run:
    // - i = 0, A[0] = 'f': j starts from 1, compares 'f' with 'i', 'n', 'd', 'i', 'n', 'g' → no duplicate.
    // - i = 1, A[1] = 'i': j starts from 2, compares 'i' with 'n', 'd', 'i' → duplicate 'i' found at j = 4.
    // - i = 2, A[2] = 'n': j starts from 3, compares 'n' with 'd', 'i', 'n' → duplicate 'n' found at j = 6.
    // - i = 3, A[3] = 'd': j starts from 4, compares 'd' with 'i', 'n', 'g' → no duplicate.
    // - i = 4, A[4] = 'i': j starts from 5, compares 'i' with 'n', 'g' → no duplicate (already found).
    // - i = 5, A[5] = 'n': j starts from 6, compares 'n' with 'g' → no duplicate (already found).
    // - i = 6, A[6] = 'g': j starts from 7, A[7] = '\0' → stops.
    // Output: Duplicate found: i, Duplicate found: n.
}

void findDuplicatesHashtable(char A[]) {
    int count[26] = {0};
    int i;
    for (i = 0; A[i] != '\0'; i++) {
        count[A[i] - 'a']++;
    }
    for (i = 0; i < 26; i++) {
        if (count[i] > 1) {
            printf("Duplicate found: %c\n", i + 'a');
        }
    }
    // Dry Run:
    // - Initialize count[] = {0, 0, ..., 0} (26 elements).
    // - i = 0, A[0] = 'f' → count['f' - 'a'] = count[5] = 1.
    // - i = 1, A[1] = 'i' → count['i' - 'a'] = count[8] = 1.
    // - i = 2, A[2] = 'n' → count['n' - 'a'] = count[13] = 1.
    // - i = 3, A[3] = 'd' → count['d' - 'a'] = count[3] = 1.
    // - i = 4, A[4] = 'i' → count[8] = 2.
    // - i = 5, A[5] = 'n' → count[13] = 2.
    // - i = 6, A[6] = 'g' → count['g' - 'a'] = count[6] = 1.
    // - i = 7, A[7] = '\0' → stop.
    // - Check count[]: count[8] = 2 ('i'), count[13] = 2 ('n').
    // Output: Duplicate found: i, Duplicate found: n.
}

void findDuplicatesBits(char A[]) {
    unsigned int checker = 0;
    int i;
    for (i = 0; A[i] != '\0'; i++) {
        int val = A[i] - 'a';
        if (checker & (1 << val)) {
            printf("Duplicate found: %c\n", A[i]);
        } else {
            checker |= (1 << val);
        }
    }
    // Dry Run:
    // - Initialize checker = 0.
    // - i = 0, A[0] = 'f' (val = 5) → checker = 0 | (1 << 5) = 32.
    // - i = 1, A[1] = 'i' (val = 8) → checker = 32 | (1 << 8) = 288.
    // - i = 2, A[2] = 'n' (val = 13) → checker = 288 | (1 << 13) = 8320.
    // - i = 3, A[3] = 'd' (val = 3) → checker = 8320 | (1 << 3) = 8328.
    // - i = 4, A[4] = 'i' (val = 8) → checker & (1 << 8) = 288, duplicate 'i' found.
    // - i = 5, A[5] = 'n' (val = 13) → checker & (1 << 13) = 8192, duplicate 'n' found.
    // - i = 6, A[6] = 'g' (val = 6) → checker = 8328 | (1 << 6) = 8360.
    // - i = 7, A[7] = '\0' → stop.
    // Output: Duplicate found: i, Duplicate found: n.
}

int main() {
    char A[] = "finding";
    printf("Method 1: Compare with Other Letters\n");
    findDuplicatesCompare(A);
    printf("Method 2: Using Hashtable or Counting\n");
    findDuplicatesHashtable(A);
    printf("Method 3: Using Bits\n");
    findDuplicatesBits(A);
    return 0;
}