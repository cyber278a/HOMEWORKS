package homework6;
//For you to do:
//
//Overload 2 final instance methods:
//
//Call them in main method
//
//**Expected Output:**
//
//```
//Final method with boolean parameter
//Final method with String parameter
//```
public class r170 {
    final void m1(boolean a){
        System.out.println("Final method with boolean parameter");}

    final void m2(String b){
        System.out.println("Final method with String parameter");
    }
    final void m1(boolean a,boolean d){
        System.out.println("Final method with boolean parameter");}

    final void m2(String b,String l){
        System.out.println("Final method with String parameter");}

    public static void main(String[] args) {
        r170 k=new r170();

        k.m1(true,false);
        k.m2("hello","good bye");
    }
}
