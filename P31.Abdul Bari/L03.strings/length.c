#include <stdio.h>

// Function to calculate string length from scratch
int stringLength(const char *str) {
    int length = 0;
    while (str[length] != '\0') { // Loop until null terminator
        length++;
    }
    return length;
}

int main() {
    char str[] = "Hello, World!"; // Example string
    int len = stringLength(str);
    printf("Length of string '%s' is: %d\n", str, len);
    return 0;
}