package homework6;

public class t166 {
    //Parent class create 4 methods with different level of access modifiers.
    // In each method print "I am parent public/protected/default/private method".
    //
    //Override methods in child class
    //
    //In Main Class create object of the child class and see which methods are available
    //
    //**Expected Output:**
    //I am a child public method
    //I am a child protected method
    //I am a child default method
    //```
    public static void main(String[] args) {


    Child7 ch7=new Child7();
    ch7.m1();
    ch7.m2();
    ch7.m3();
}}
class Parent7{
    public void m1(){
        System.out.println("I am parent public method");}

    protected void m2(){
        System.out.println("I am parent protected method");}

     void m3(){
        System.out.println("I am parent default method");}
    public void m4(){
        System.out.println("I am parent private method");}
}
class Child7 extends Parent7{
    public void m1(){
        System.out.println("I am a child public method");}
    protected void m2(){
        System.out.println("I am a child protected method");}

    protected void m3(){
        System.out.println("I am a child dafault method");}

    //private void m4(){
     //   System.out.println("I am child private method");}
}