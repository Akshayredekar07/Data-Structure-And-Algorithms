package First;

class Employees{
    int salary;
    String name;
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

class  cellPhone{
    public void ringing(){
        System.out.println("Ringing....");
    }
    public void vibrating(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling friend asus...");
    }
}

class  Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class RectangleDimensions {
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 4*(length + breadth);
    }
}
public class T39__psOfClassesObjects {

    public static void main(String[] args) {

//        Employees E1 = new Employees();
//
//        E1.salary = 233;
//        E1.setName("Akshay");
//        System.out.println(E1.getSalary());
//        System.out.println(E1.getName());

//        cellPhone asus = new cellPhone();
//        asus.callFriend();
//        asus.ringing();
//        asus.vibrating();


//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println("Area of square : " + sq.area());
//        System.out.println("perimeter of square : " + sq.perimeter());

        RectangleDimensions in = new RectangleDimensions();
        in.length = 2;
        in.breadth = 3;
        System.out.println(in.area());
        System.out.println(in.perimeter());



    }
}
