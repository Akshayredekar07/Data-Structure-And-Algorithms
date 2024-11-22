#include <iostream>
using namespace std;

int add(int a, int b){
	int c = a+b;
	return c;
}

int main(){
	
	int x, y, z;
	x = 10, y = 5;
	z = add(x,y);
	cout<<"addition of x and y : "<<z;
	
	return 0;
}
