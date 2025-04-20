#include <stdio.h>
#include <string.h>

int main() {
    // These are equivalent ways to work with strings
    char str1[] = "Hello";    // Array notation
    char *str2 = "Hello";     // Pointer notation

    // Both allow array-like access
    char firstChar1 = str1[0];  // 'H'
    char firstChar2 = str2[0];  // 'H'

    // Both can be traversed
    while (*str2 != '\0') {
        // Process each character
        str2++;
    }

    return 0;
}
