
#include <stdio.h>
#include <string.h>

// Method 1: Using two pointers (in-place reversal)
void reverseStringTwoPointers(char *str) {
    int left = 0;
    int right = strlen(str) - 1;
    char temp;
    
    while (left < right) {
        temp = str[left];
        str[left] = str[right];
        str[right] = temp;
        left++;
        right--;
    }
}

// Method 2: Using recursion
void reverseStringRecursive(char *str, int start, int end) {
    if (start >= end) return;
    
    char temp = str[start];
    str[start] = str[end];
    str[end] = temp;
    
    reverseStringRecursive(str, start + 1, end - 1);
}

// Method 3: Using a stack (array-based)
void reverseStringStack(char *str) {
    int len = strlen(str);
    char stack[100];
    int top = -1;
    
    // Push all characters to stack
    for (int i = 0; i < len; i++) {
        stack[++top] = str[i];
    }
    
    // Pop all characters back to string
    for (int i = 0; i < len; i++) {
        str[i] = stack[top--];
    }
}

// Method 4: Using XOR swap
void reverseStringXOR(char *str) {
    int len = strlen(str);
    for (int i = 0, j = len - 1; i < j; i++, j--) {
        str[i] ^= str[j];
        str[j] ^= str[i];
        str[i] ^= str[j];
    }
}

// Method 5: Creating new string
void reverseStringNewString(char *str, char *result) {
    int len = strlen(str);
    for (int i = 0; i < len; i++) {
        result[i] = str[len - 1 - i];
    }
    result[len] = '\0';
}

int main() {
    char str1[] = "HelloWorld";
    char str2[] = "HelloWorld";
    char str3[] = "HelloWorld";
    char str4[] = "HelloWorld";
    char str5[] = "HelloWorld";
    char result[100];
    
    printf("Original string: %s\n", str1);
    
    // Method 1: Two pointers
    reverseStringTwoPointers(str1);
    printf("Two pointers: %s\n", str1);
    
    // Method 2: Recursive
    reverseStringRecursive(str2, 0, strlen(str2) - 1);
    printf("Recursive: %s\n", str2);
    
    // Method 3: Stack
    reverseStringStack(str3);
    printf("Stack: %s\n", str3);
    
    // Method 4: XOR
    reverseStringXOR(str4);
    printf("XOR: %s\n", str4);
    
    // Method 5: New string
    reverseStringNewString(str5, result);
    printf("New string: %s\n", result);
    
    return 0;
}

/*
Dry Run for Each Method (Input: "HelloWorld", Length = 10)

1. Two Pointers Method (reverseStringTwoPointers):
   Initial: str = "HelloWorld", left = 0, right = 9
   Iteration 1: left = 0 ('H'), right = 9 ('d')
     Swap: str = "delloWorlH"
     left = 1, right = 8
   Iteration 2: left = 1 ('e'), right = 8 ('l')
     Swap: str = "dllloWoreH"
     left = 2, right = 7
   Iteration 3: left = 2 ('l'), right = 7 ('r')
     Swap: str = "dlrloWolleH"
     left = 3, right = 6
   Iteration 4: left = 3 ('l'), right = 6 ('o')
     Swap: str = "dlroWolleH"
     left = 4, right = 5
   Iteration 5: left = 4 ('o'), right = 5 ('W')
     Swap: str = "dlroWolleH"
     left = 5, right = 4 (left > right, stop)
   Final: str = "dlroWolleH"

2. Recursive Method (reverseStringRecursive):
   Initial call: start = 0, end = 9
   Call 1: Swap str[0] ('H') with str[9] ('d')
     str = "delloWorlH", recursive call (start = 1, end = 8)
   Call 2: Swap str[1] ('e') with str[8] ('l')
     str = "dllloWoreH", recursive call (start = 2, end = 7)
   Call 3: Swap str[2] ('l') with str[7] ('r')
     str = "dlrloWolleH", recursive call (start = 3, end = 6)
   Call 4: Swap str[3] ('l') with str[6] ('o')
     str = "dlroWolleH", recursive call (start = 4, end = 5)
   Call 5: Swap str[4] ('o') with str[5] ('W')
     str = "dlroWolleH", recursive call (start = 5, end = 4)
   Call 6: start >= end, return
   Final: str = "dlroWolleH"

3. Stack Method (reverseStringStack):
   Initial: str = "HelloWorld", stack = [], top = -1
   Push phase:
     i = 0: Push 'H', stack = ['H'], top = 0
     i = 1: Push 'e', stack = ['H', 'e'], top = 1
     i = 2: Push 'l', stack = ['H', 'e', 'l'], top = 2
     i = 3: Push 'l', stack = ['H', 'e', 'l', 'l'], top = 3
     i = 4: Push 'o', stack = ['H', 'e', 'l', 'l', 'o'], top = 4
     i = 5: Push 'W', stack = ['H', 'e', 'l', 'l', 'o', 'W'], top = 5
     i = 6: Push 'o', stack = ['H', 'e', 'l', 'l', 'o', 'W', 'o'], top = 6
     i = 7: Push 'r', stack = ['H', 'e', 'l', 'l', 'o', 'W', 'o', 'r'], top = 7
     i = 8: Push 'l', stack = ['H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l'], top = 8
     i = 9: Push 'd', stack = ['H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'], top = 9
   Pop phase:
     i = 0: Pop 'd', str[0] = 'd', top = 8
     i = 1: Pop 'l', str[1] = 'l', top = 7
     i = 2: Pop 'r', str[2] = 'r', top = 6
     i = 3: Pop 'o', str[3] = 'o', top = 5
     i = 4: Pop 'W', str[4] = 'W', top = 4
     i = 5: Pop 'o', str[5] = 'o', top = 3
     i = 6: Pop 'l', str[6] = 'l', top = 2
     i = 7: Pop 'l', str[7] = 'l', top = 1
     i = 8: Pop 'e', str[8] = 'e', top = 0
     i = 9: Pop 'H', str[9] = 'H', top = -1
   Final: str = "dlroWolleH"

4. XOR Method (reverseStringXOR):
   Initial: str = "HelloWorld", i = 0, j = 9
   Iteration 1: i = 0 ('H'), j = 9 ('d')
     str[0] ^= str[9]: str[0] = 'H' ^ 'd'
     str[9] ^= str[0]: str[9] = 'd' ^ ('H' ^ 'd') = 'H'
     str[0] ^= str[9]: str[0] = ('H' ^ 'd') ^ 'H' = 'd'
     str = "delloWorlH", i = 1, j = 8
   Iteration 2: i = 1 ('e'), j = 8 ('l')
     XOR swap: str[1] = 'l', str[8] = 'e'
     str = "dllloWoreH", i = 2, j = 7
   Iteration 3: i = 2 ('l'), j = 7 ('r')
     XOR swap: str[2] = 'r', str[7] = 'l'
     str = "dlrloWolleH", i = 3, j = 6
   Iteration 4: i = 3 ('l'), j = 6 ('o')
     XOR swap: str[3] = 'o', str[6] = 'l'
     str = "dlroWolleH", i = 4, j = 5
   Iteration 5: i = 4 ('o'), j = 5 ('W')
     XOR swap: str[4] = 'W', str[5] = 'o'
     str = "dlroWolleH", i = 5, j = 4 (i > j, stop)
   Final: str = "dlroWolleH"

5. New String Method (reverseStringNewString):
   Initial: str = "HelloWorld", result = [], len = 10
   Loop:
     i = 0: result[0] = str[9] = 'd'
     i = 1: result[1] = str[8] = 'l'
     i = 2: result[2] = str[7] = 'r'
     i = 3: result[3] = str[6] = 'o'
     i = 4: result[4] = str[5] = 'W'
     i = 5: result[5] = str[4] = 'o'
     i = 6: result[6] = str[3] = 'l'
     i = 7: result[7] = str[2] = 'l'
     i = 8: result[8] = str[1] = 'e'
     i = 9: result[9] = str[0] = 'H'
   Add null terminator: result[10] = '\0'
   Final: result = "dlroWolleH"
*/



