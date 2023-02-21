package homework6;

          //REPLIT 143

////Create the following variable (**Choose proper datatype**)
////* make
////* model
////* numberOfDoors
////* topSpeed
////* price
////following the proper naming convention for variables.
////Write four constructors:
////* The first constructor(with all parameters)
////* A secondary constructor Have all parameters **except numberOfDoors. (**numberOfDoors value should assign to 4 inside constructor)
////* A third constructor Have all parameters **except make and model .** **(**make and model value should assign to "unknown" inside constructor)
////
////* A fourth constructor Have all parameters **except topSpeed and price**;**(**topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)
////
////Create a display method in Cars class to print the class variable value in console.
////
////2. Test your code with the Main.java class:
////
////Create several Car objects using all Constructors.
////
////then call display method with each object.
////
////Output:
////numberOfDoors
// Dog(String dogName,String dogBreed,int
//            dogAge,double dogWeight){
//        name=dogName;
//        breed=dogBreed;
//        age=dogAge;
//        weight=dogWeight;
public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;
    Car(String make,String model,int numberOfDoors,int topSpeed,double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;}

    Car(String make,String model,int topSpeed,double price){
        this.make=make;
        this.model=model;
        numberOfDoors=4;
        this.topSpeed=topSpeed;
        this.price=price;}

    Car(int topSpeed,int numberOfDoors,double price){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;}

    Car(String make,String model,int numberOfDoors){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=90;
        this.price=0;}
    void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }

    public static void main(String[] args) {
        Car c1=new Car("Toyota","Prius",4,120,30000);
        c1.display();
        Car c2=new Car("Toyota","Prius",120,30000);
        c2.display();
        Car c3=new Car(120,4,30000);
        c3.display();
Car c4=new Car("Toyota","Prius",4);
c4.display();
    }
}
