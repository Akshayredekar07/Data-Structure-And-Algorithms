public class MethodOverloading {
    public static void main(String []args) {
        
    }
}


class Calculator {

    int sum(int a, int b){
        return a+b;
    }
    
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}