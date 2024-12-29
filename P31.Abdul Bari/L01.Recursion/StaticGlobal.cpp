#include<iostream>
using namespace std;


int x = 0;


int fun(int n) {
    if (n > 0) {
        return fun(n - 1) + n;
    }
    return 0;
}

int staticFun(int n) {
    static int x = 0;
    if (n > 0) {
        x++;
        return staticFun(n - 1) + x; 
    }
    return 0;
}


int GlobalFun(int n) {
    if (n > 0) {
        x++;
        return GlobalFun(n - 1) + x; 
    }
    return 0;
}

int main() {
    int r;
    r = fun(5);
    printf("%d\n", r);


    printf("%d\n", staticFun(5)); 

    printf("%d\n", GlobalFun(5)); 

    return 0;
}
 