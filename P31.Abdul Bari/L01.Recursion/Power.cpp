#include <iostream>
using namespace std ;

int power(int m, int n){
    if(n==0){
        return 1;
    }
    return power(m, n-1)*m;
}
/* Dry run for power(2,9):
power(2,9) = power(2,8)*2 = 512
    power(2,8) = power(2,7)*2 = 256
        power(2,7) = power(2,6)*2 = 128
            power(2,6) = power(2,5)*2 = 64
                power(2,5) = power(2,4)*2 = 32
                    power(2,4) = power(2,3)*2 = 16
                        power(2,3) = power(2,2)*2 = 8
                            power(2,2) = power(2,1)*2 = 4
                                power(2,1) = power(2,0)*2 = 2
                                    power(2,0) = 1
*/

int power2(int m, int n){
    if(n==0){
        return 1;
    }
    if(n%2==0){
        return power2(m*m, n/2);
    }else{
        return m*power2(m*m, (n-1)/2);
    }
}
/* Dry run for power2(2,9):
power2(2,9) = 2*power2(4,4) = 512
    power2(4,4) = power2(16,2) = 256
        power2(16,2) = power2(256,1) = 256
            power2(256,1) = 256*power2(65536,0) = 512
                power2(65536,0) = 1
*/

int main(){
    int r = power(2, 9);
    cout<<r<<endl;

    int a = power2(2,9);
    printf("%d ", a);
    return 0;
}