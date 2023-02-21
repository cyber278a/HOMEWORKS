package homework6;

public class Parent1 {
    //In parent class
//Create a non argument constructor and write a logic to print "This is Parent constructor"
//Create a Child Class that will be subclass of the Parent class
//Create a constructor without parameter and call parent class constructor expicitly
//In Main Class.
//Create and object of Child class and run the application.
//
//**Expected Output:**
//
//```
//This is Parent constructor
//```


    public Parent1() {
    }

    void displayInfo(){
        System.out.println("This is Parent constructor");
    }
}
class Child1 extends Parent1{
    public Child1() {super();
    }

}
class Test1{
    public static void main(String[] args) {
        Child1 ch=new Child1();
        ch.displayInfo();
    }
}