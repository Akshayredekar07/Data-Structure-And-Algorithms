package First;

class Base{
    int x;
    public void setX(int x) {
        System.out.println("I an in Base class and setting x now ");
        this.x = x;
    }
    public int getX() {  return x; }
}

class Derived extends Base{
    int y;
    public void setY(int y) {
        System.out.println("I am in derived class and setting Y now ");
        this.y = y; }
    public int getY() { return y; }
}


public class T45__Inheritance {
    public static void main(String[] args) {
        Derived b = new Derived();
        b.setX(4);
        System.out.println(b.getX());

        b.setY(34);
        System.out.println(b.getY());
    }
}
