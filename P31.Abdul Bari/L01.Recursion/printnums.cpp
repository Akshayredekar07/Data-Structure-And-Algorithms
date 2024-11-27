#include <iostream>

using namespace std;

void fun1(int n) {
    if (n > 0) {
    	cout<<n<<" ";
        fun1(n - 1);
    }
}

void fun2(int count){
    if(count>=10){
    return;
    }
    cout<<count<<" ";
    fun2(count+1);
}

int main() {
    int x = 3;
    fun1(x);
    
    fun2(0);
    return 0;
}

