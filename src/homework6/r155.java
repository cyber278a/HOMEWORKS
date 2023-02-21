package homework6;
//1. Create three classes (A, B, C)
//
//Write two constructors:
//
//* Have a default constructor that prints out the following
//
//For A:  "I"
//
//For B: "am"
//
//For C: "a tester"
//
//Make C extend B
//
//and B extend A
//
//From your Main class create an object of the C class.
public class r155 {
    public static void main(String[] args) {
        C c=new C();

    }
}

class A{
    public A() {
        System.out.println("I");
    }
}
class B extends A{

    public B()
    {super();
        System.out.println("am");
    }

}
class C extends B{
    public C() {
        super();
        System.out.println("a tester");
    }
}