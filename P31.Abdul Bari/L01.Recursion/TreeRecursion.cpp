#include <iostream>
using namespace std;

void fun(int n){
    if(n>0){
        printf("%d ", n);
        fun(n-1);
        fun(n-1);
    }
}

int main(){
    fun(3);
    return 0;
} 

/*
Dry Run:
                    fun(3)
                 3 /     \
                 fun(2)  fun(2)
              2 /    \   2/    \
              fun(1) fun(1) fun(1) fun(1)
           1 /    \  1/   \ 1/   \ 1/   \
           fun(0) fun(0) fun(0) fun(0) fun(0) fun(0) fun(0) fun(0)

Output: 3 2 1 1 2 1 1

Explanation:
1. fun(3) prints 3, then calls fun(2) twice
2. First fun(2) prints 2, then calls fun(1) twice
3. First fun(1) prints 1, then calls fun(0) twice (returns)
4. Second fun(1) prints 1, then calls fun(0) twice (returns)
5. Second fun(2) prints 2, then process repeats
*/