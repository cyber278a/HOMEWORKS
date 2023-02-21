package homework6;

public class r152 {
    //In Parent class.
    // Create a constructor, it will take a String parameter called city.
    //include the logic of printing the parameter value.
    //Create another constructor without parameter.
    //Include the logic of printing "Parent Constructor".
    //Create a Child Class that should be a subclass of Parent class
    //Inside child class create a constructor that will make a call to parameterized constructor of the parent class.
    //In Main class.
    //Create an Object of the child class by passing String value "Vienna"
    //**Expected Output:**
    //Vienna


    public static void main(String[] args) {
        Child ch=new Child("Vienna");
       ch.displayInfo1();

    }
}
class Parent{

    String city;
     Parent(String city){
        this.city=city;}


        void displayInfo1(){
            System.out.println(city);

        }


    void displayInfo(){
        System.out.println("Parent Constructor");
    }

    Parent(){
        }


}
class Child extends Parent{
    public Child(String city) {
        super(city);
    }


}