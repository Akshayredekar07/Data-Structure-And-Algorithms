public class OOPS{
    public static void main(String[] args) {
        
        Pen p1 = new Pen();
        p1.setColor("Orange");
        System.out.println(p1.color);

        p1.setTip(4);


        p1.color = "Navy blue";
        System.out.println(p1.color);


        BankAccount myAccount = new BankAccount();
        myAccount.username = "Akshayredekar07";
        //you cannot set the passward directly 
        //because it is private therefore it is not visible outside the class
        //myAccount.passward = "12347"; --give the error
        myAccount.setPassward("123456");

    }
}

class Pen{

    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}


class Student{
    String name;
    int age;
    float percentage;

    void calcPercent(float chem, float phy, float maths, float marathi){
        float total = chem+phy+maths+marathi;
        float percent = total/4;
    }
}


class BankAccount{
    public String username;
    private String passward;

    public void setPassward(String pwd){
        passward = pwd;
    }

}
 