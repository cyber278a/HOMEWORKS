package homework6;

public class r174 {

}
//Create an Interface with name as MyInterface
//
//Create two undefined methods method1 and method2
//
//Inherit the MyInterface to Main Class.
//
//Execute both methods
//
//**Expected Output:**
//
//```
//implementation of method1
//```
//
//```
//implementation of method2
interface MyInterface{
    void method1();
    void method2();

}
class Main2 implements MyInterface{
    @Override
    public void method1() {
        System.out.println("implementation of method1");

    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");

    }

    public static void main(String[] args) {
     Main2 m2=new Main2();
     m2.method1();
     m2.method2();
    }
}