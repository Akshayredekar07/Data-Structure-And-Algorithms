public class AbstractClass {
    public static void main(String[] args) {
     
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();

        // Animal a=new Animal();
        //we cannot create the object of the animal class
        //beacuse it is abstract class

        Mustang myHorse = new Mustang();
    }
}

abstract class  Animal {

    String color;

    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();

    //we can create the constructor of the abstract class
    Animal(){
        System.out.println("Animal Contructor called first");
        color="Brown";
    }
    
}

class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor is called");
    }

    void changeColor(){
        color="Drak Brown";
    
    }

    void walk(){
        System.out.println("walk on 4 legs");
    }
}


class Chicken extends Animal{
    
    void walk(){
        System.out.println("walk on the 2 legs");
    }
}


class Mustang extends Horse{

    Mustang(){
        System.out.println("Mustang constructor called");  
    }
}