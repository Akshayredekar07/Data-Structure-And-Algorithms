public class Constructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        // Student s2 = new Student("ramesh", 123);
        // System.out.println(s2.name +" " + s2.roll);

        s1.name = "karan";
        s1.roll = 123;
        s1.passward = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 91;

        Student1 s2 = new Student1(s1);
        s2.passward = "xyz";

        //updating the marks
        s1.marks[1] = 74;

        for(int i=0; i<3; i++){
            System.out.print(s2.marks[i]+ " ");
        }

        
    }
}

class Student1 {
    String name;
    int roll;
    String passward;
    int[] marks;
    //obj of subclass
    Address add;
    //subclass
    class Address{
        String city;
    }

    Student1(){
        marks = new int[3];
      System.out.println("Non parameterized constructor is called!");  
    }

    Student1(String myName, int rollNum){
        marks = new int[3];
        System.out.println("Parameterized constructor is called!");  
        this.name = myName;
        this.roll= rollNum;
    }

    // sollow Copy constructor
    // Student(Student s1){
    //     this.name = name;
    //     this.roll = roll;
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }


    //deep copy
    Student1(Student1 s1){
        this.name = name;
        this.roll = roll;
        marks = new int[3];
        // this.marks = s1.marks;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
