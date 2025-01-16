#include <stdio.h>
#include <stdlib.h>

int main() {
    
    int A[10]={2,4,6,8,10};
    int *p;
    p=(int *)malloc(5*sizeof(int));

    p[0]=1;
    p[1]=3;
    p[2]=7;
    p[3]=9;
    p[4]=11;

    printf("Array A elements:\n");
    for(int i = 0; i < 5; i++) {
        printf("A[%d] = %d\n", i, A[i]);
    }

    printf("\nArray p elements:\n");
    for(int i = 0; i < 5; i++) {
        printf("p[%d] = %d\n", i, p[i]);
    }

    printf("\nAddress of p: %p\n", (void*)p);
    printf("p is pointing to: %d\n", p[0]);

    return 0;
}