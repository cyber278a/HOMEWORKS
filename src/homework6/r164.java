package homework6;
//Create a method hello() in parent class that will print "method in Parent class" then override  that method is 3 Subclasses implementing login to print "method in Child1/Child2/Child3 class"
//
//In Main Class create 3 object of the child classes and store in into an array and call method hello():
//
//**Expected Output:**
//
//```
//method in Child1 class
//method in Child2 class
//method in Child3 class
//```
public class r164 {
    public static void main(String[] args) {


    Child11 ch11=new Child11();
    ch11.hello();
        Child22 ch22=new Child22();
        ch11.hello();
        Child33 ch33=new Child33();
        ch11.hello();
}}
class Parent6{
    void hello(){
        System.out.println("method in Parent class");
    }}
    class Child11 extends Parent6{
        @Override
        void hello() {
            System.out.println("method in Child1 class");

        }
    }
class Child22 extends Parent6{
    @Override
    void hello() {
        System.out.println("method in Child2 class");

    }
}
class Child33 extends Parent6{
    @Override
    void hello() {
        System.out.println("method in Child3 class");

    }
}