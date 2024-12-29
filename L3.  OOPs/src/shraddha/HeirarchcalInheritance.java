public class HeirarchcalInheritance {

    public static void main(String[] args) {
        
        
    }
}


class Animal{
    String color;

    void eat(){
        System.out.println("eat");
    }

    void breath(){
        System.out.println("breath");
    }
}



class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim in water");
    }
}


class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Mammals can walk ");
    }
}


class bird extends Animal{
    String fly;
    void birdFly(){
        System.out.println("Bird class");
    }
}