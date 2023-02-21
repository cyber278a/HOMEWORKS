package homework6;

public class r154 {
    public static void main(String[] args) {
        Child2 ch2=new Child2();
        Child2 ch22=new Child2(10);
    }

}
//In Parent Class.
//
//Create a no-argument constructor and include the logic to print "Parent Constructor without argument"
//
//Create another constructor that takes one parameter of integer type called number.
//
//include the logic to print the value of the number.
//
//In Child class.
//
//Create a Constructor without parameter and include the logic to print "Child Constructor without argument"
//
//Overload the constructor by adding one parameter of type integer
//
//Inside the constructor call the parameterized parent class constructor.
//
//In Main Class.
//
//Create an object of Child without passing any argument.
//
//And then another object of Child class by passing the value "10". run the application.
//
//**Expected Output:**
//Parent Constructor without argument
//Child Constructor without argument`
class Parent2{
    public Parent2() {System.out.println("Parent Constructor without argument");
    }


    public Parent2(int number) {System.out.println(number);
    }}
class Child2 extends Parent2{
    public Child2() {
        System.out.println("Child Constructor without argument");}


    public Child2(int number) {

        super( number);
    }


    }



