
//structure in C++ is used to bundle related data, while in Java, a class is used for the same purpose but with more encapsulation options.
class Rectangle {
    int length;
    int breadth;

    // Method to calculate area
    public int area() {
        return length * breadth;
    }
}


public class Structures {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 15;
        r.breadth = 10;
    
        System.out.println("Area of Rectangle is " + r.area());
    }
}  



