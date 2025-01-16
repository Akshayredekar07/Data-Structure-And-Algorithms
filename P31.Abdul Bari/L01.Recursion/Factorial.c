#include <stdio.h>


int fact(int n) {
    if (n < 0) {
        return -1; 
    }
    if (n == 0) { 
        return 1;
    }
    return fact(n - 1) * n;
}

int main() {

    int result;
    result = fact(-1);
    printf("%d ", result);
  

    result = fact(5);
    printf("%d ", result);

    return 0;
}
