
#include <stdio.h>

void fun_tail(int n){
    if(n>0){
        printf("%d ", n);
        fun(n-1);
    }   
}

void fun_head(int n){
    if(n>0){
        fun(n-1);
        printf("%d ", n);
    }   
}

int main(){
    int x = 3;
    fun_tail(x);
    return 0;
}

/*
Dry Run (Interactive):

[main() starts]
|-- x = 3
|-- fun(3) called
    |
    |-- n = 3
    |-- prints: 3
    |-- fun(2) called
        |
        |-- n = 2
        |-- prints: 2
        |-- fun(1) called
            |
            |-- n = 1
            |-- prints: 1
            |-- fun(0) called
                |
                |-- n = 0
                |-- condition false, returns
            |-- returns
        |-- returns
    |-- returns
|-- main() returns

Output: 3 2 1

main() returns

Output: 3 2 1
*/


 