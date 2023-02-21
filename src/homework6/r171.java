package homework6;
//Create a Parent Class that will have two overloaded abstract methods m1
//Make Main class as concrete subclass to Parent Class
//In main method call the methods.
//
//**Expected Output:**
//m1 without parameters
//m1 method with parameter
//```
 class r171 {
    public static void main(String[] args) {
      Main1 m=new Main1();
      m.m1();
      Main1 mm=new Main1();
      mm.m1(7);
    }
}
 abstract class Parent8 {
    abstract void m1();

    abstract void m1(int a);
}
class Main1 extends Parent8{
    void m1(){
        System.out.println("m1 without parameters");
    }
     void m1(int a){
         System.out.println("m1 method with parameter");
     }


}

