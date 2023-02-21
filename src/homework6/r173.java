package homework6;
//Create a Super Class Tea that will have:
//
//- instance variable teaType;
//- constructor that will initialize
//- unimplemented method addSugar(),
//
//Create 2 subclasses of Tea as Lemon Tea and Chai Tea.
//
//In main class create an object of 2 Child and assign them to Parent reference type.
//
//Execute method addSugar from both classes.
//
//**Expected Output:**
//For Lemon Tea we need 2 spoons of sugar
//For Chai Tea we need 1 spoon of sugar
public class r173 {
    public static void main(String[] args) {
        LemonTea lt=new LemonTea("chai");
        lt.addSugar();
        chaiTea ct=new chaiTea("chail");
        ct.addSugar();
    }
}
abstract class Tea {
    String teatype;

     Tea(String teatype) {
        this.teatype = teatype;
    }

    abstract void addSugar();
}

class LemonTea extends Tea{
     LemonTea(String teatype) {
        super(teatype);
    }

    void addSugar(){
        System.out.println("For Lemon Tea we need 2 spoons of sugar");
    }
}
class chaiTea extends Tea{
    chaiTea(String teatype) {
        super(teatype);
    }
    void addSugar(){
        System.out.println("For Chai Tea we need 1 spoon of sugar");
}}
