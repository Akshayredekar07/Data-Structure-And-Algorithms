package shraddha;

public class Statickeyword {
    
    public static void main(String[] args) {
        System.out.println("Statickeyword.main()");

        Student2 s1 = new Student2();
        s1.schoolName =  "Bajaj";

        Student2 s2 = new Student2();
        System.out.println(s2.schoolName);

        //static object created in memory will create at only ones for all objects


    }
}
 

class Student2{

    static int returnPercentage(int math, int phy, int chem){
        return (math+phy+chem)/3;
    }

    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    void getName(){
        this.name=name;
    }
}