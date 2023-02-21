package homework6;
//Overload private instance method m1
//
//Call each method from the main method.
//
//
//
//Expected Output:
//
//```
//private m1 method
//private m1 method with int parameter
//```
public class r161 {
    private  void m1(){
        System.out.println("private m1 method");
    }
    private void m1(int a){
        System.out.println("private m1 method with int parameter");
    }

    public static void main(String[] args) {
        r161 f=new r161();
        f.m1();
        f.m1(5);
    }
}
