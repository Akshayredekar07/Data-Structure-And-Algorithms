public class Inheritance {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        dobby.bread = "Indian";
        System.out.println(dobby.bread);
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

//Single level 
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swim in water");
    }
}


//multilevel
class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String bread;
}