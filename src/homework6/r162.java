package homework6;
//Overload static method and then execute both overloaded methods.
//
//**Expected Output:**
//
//```
//static method without parameter
//static method with int parameter
//```
public class r162 {
    static void m1(){
        System.out.println("static method without parameter");}
    static void m1(int a){
        System.out.println("static method with int parameter");}

    public static void main(String[] args) {
        m1();
        m1();
    }
}
