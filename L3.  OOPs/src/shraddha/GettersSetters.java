public class GettersSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
    }
}


class Pen{
    String color;
    int tip;


//getters
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }


//setters
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
} 