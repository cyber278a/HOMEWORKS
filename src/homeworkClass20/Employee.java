package homeworkClass20;
//2. Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
//Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
//Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
//Test your code!
public class Employee {
    String name;
    String iD;
    double salary;
    Employee(String name,String iD,double salary){
        this.name=name;
        this.iD=iD;
        this.salary=salary;}

    void flexibility(){
        System.out.println("Available to work weekends");

    }
}
class FullTime extends Employee{
    char gender;
    FullTime(String name,String iD,double salary,char gender){
        super(name,iD,salary);
        this.gender=gender;
    }
    void full(){
        System.out.println("Can work full time");
    }
}
class PartTime extends Employee{
    boolean partTime;
    PartTime(String name,String iD,double salary,boolean partTime){
        super(name,iD,salary);
        this.partTime=partTime;}

    void secondJob(){
        System.out.println("Employee has another job");
    }
    }

class Tester extends FullTime{
    int age;
    Tester(String name,String iD,double salary,char gender,int age){
        super(name,iD,salary, gender);
        this.age=age;}

    void test(){
        System.out.println("Name is "+ name+",ID#"+iD+",salary="+salary+",gender is "+gender+" and age is "+age);}

    public static void main(String[] args) {
        Tester employee1=new Tester("John","r4565678",100000,'M',35 );
        employee1.test();
        employee1.flexibility();
        employee1.full();
    }
}