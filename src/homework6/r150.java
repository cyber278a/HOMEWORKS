package homework6;
//1. Create four classes (Person, Employee, Student, Retiree)
//
//* Have properties
//
//For Person: name(String)
//
//For Person: lastName(String)
//
//For Person: age(int)
//
//For Employee: salary(int)
//
//For Student: grade(int)
//
//For Retiree: seniorActivity(String)
//
//At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output
//
//Create multilevel inheritance: Person --> Employee --> Student --> Retiree
//
//From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
//
//**Expected Output:**
//
//```
//Joe Smith 35 35000
//Adam Smith 15 10
//Frank Smith 15 tour
public class r150 {
}
class Person{

String name;
String lastName;
int age;


}
class Employee extends Person{
    int salary;
    void displayInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);}
}
class Student extends Employee{

    int grade;

    void displayInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);}
}
class Retiree extends Student{
    String seniorActivity;
    void displayInfo(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);}

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.name="Joe";
        e1.lastName="Smith";
       e1.age=35;
       e1.salary=35000;
        e1.displayInfo();

        Student s1=new Student();
        s1.name="Adam";
        s1.lastName="Smith";
        s1.age=15;
        s1.grade=10;
        s1.displayInfo();

        Retiree r1=new Retiree();
        r1.name="Frank";
        r1.lastName="Smith";
        r1.age=15;
        r1.seniorActivity="tour";
        r1.displayInfo();
    }


}