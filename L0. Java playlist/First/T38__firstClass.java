package First;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My name is: " + name);
        System.out.println("My Id is: " + id);
        System.out.println("My salary is: " + salary);
    }
}

/* How to module the problem in oops
   Noun       ->  Class     -> Employee
   Adjective  ->  Attribute -> name, age, salary
   Verb       ->  Method    -> getSalary, increment
 */

public class T38__firstClass {

    public static void main(String[] args) {

        Employee harry = new Employee();  //Instantiating a new Employee object
        Employee john  = new Employee();  //Instantiating a new Employee object

        // Setting attributes
        harry.id = 34;
        harry.name = "karan";
        harry.salary = 17;
        john.id = 35;
        john.name = "John mama";
        john.salary = 13;

        // Printing the attributes
        //System.out.println(harry.id);
        //System.out.println(harry.name);

        // Calling class functions using the object of the class
        harry.printDetails();
        john.printDetails();
    }
}
