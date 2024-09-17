package First;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

class circleArea{
    private double pi ;
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
}

public class T40__AccessModifiers {
    public static <CircleArea> void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 34;
//        harry.name = "coder";  // Throws an error due to the private access modifiers

        harry.setName("Akshay");
        System.out.println(harry.getName());

        circleArea a1 = new circleArea();
        a1.setRadius(4.0f);
        System.out.println(a1.getRadius());
    }
}
