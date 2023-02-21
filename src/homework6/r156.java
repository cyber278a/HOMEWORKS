package homework6;
//Create class A
//
//declare variable int i=10;
//
//Create class B  extends A
//
//declare variable int i=20;
//
//create a method to display value of variable i from both classes
//
//In Main Class create an object of subclass and call method display
//
//**Expected Output:**
//
//```
//20
//```
//
//```
//10
//```
public class r156 {

}
class A1{
    int i=10;
    void displaInfo(){
        System.out.println(i);
    }
}
class B1 extends A1{
    int i=20;

    @Override

    void displaInfo() {

        System.out.println(i);
        super.displaInfo();
    }
}
class tes1{
    public static void main(String[] args) {
        B1 b1=new B1();
        b1.displaInfo();
    }
}