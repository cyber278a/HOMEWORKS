package homework6;
//Create Class call Parent.
//
//create a class String **variable** call city.
//
//create Parent constructor take the String parameter city. include the logic to assign the value of parameter to class variable.
//
//create method with below specification.
//
//access modifier public.
//
//return type void
//
//name display
//
//Write to logic print below sentence.
//
//"City name " + the value of class variable.
//
//Create Child Class.
//
//inherit to Parent class.
//
//create Child constructor with one String parameter called city.
//
//call super constructor and pass the parameter.
//in Main Class.
//
//Create and object of Child class. pass city name as "Fairfax" and call the display method.
//Output.
//
//City name Fairfax
public class r158 {
    public static void main(String[] args) {


    Child4 ch4=new Child4("Fairfax");
    ch4.display();
}}
 class Parent4{


    String city;

    public Parent4(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println("City name " + city);
    }
}
class Child4 extends Parent4{
    public Child4(String city) {
        super(city);
    }
}