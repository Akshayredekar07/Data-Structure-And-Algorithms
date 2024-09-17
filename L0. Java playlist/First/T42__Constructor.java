package First;

class MyEmployee01{
    private int id;
    private String name;

    public MyEmployee01(){
        id = 45;
        name = "Your-name_Here";
    }

    public MyEmployee01(int Id, String myName){
        id = Id;
        name = myName;
    }
    public String getName() { return name; }
    public void setName(String n){ this.name = n; }
    public void setId(int i) { this.id = i; }
    public int getId() { return id; }
}
public class T42__Constructor {

    public static void main(String[] args) {
        MyEmployee01 harry = new MyEmployee01();
//        MyEmployee01 harry = new MyEmployee01(64, "AkshayRedekar");
        //harry.setName("akshay");
        //harry.setId(34);

        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
