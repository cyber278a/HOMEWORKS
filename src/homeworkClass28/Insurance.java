package homeworkClass28;

import java.util.ArrayList;

//6) Create a class Insurance that will have an attribute as insuranceName and
// unimplemented behaviour as getQuote and cancelInsurance.
// Create 3 subclasses Car, Pet, Health.
// Car class has it’s own attribute as carModel and Class Pet has petType attribute.
// Create 3 objects of the sub classes and store them in ArrayList.
// Using for loop/advanced for loop/ iterator access all methods of the class.

abstract public class Insurance {
    String insuranceName;

     abstract void getQuote();
     abstract void cancelInsurance();
}
class Car extends Insurance{
    String CarModel;

    @Override
    void cancelInsurance() {

    }

    @Override
    void getQuote() {

    }
}
class Cat extends Insurance{
    String petType;

    @Override
    void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class Health extends Insurance{
    @Override
    void getQuote() {

    }

    @Override
    void cancelInsurance() {

    }
}
class Test{
    public static void main(String[] args) {


    Car car=new Car();
    Cat cat=new Cat();
    Health health=new Health();
    ArrayList<Insurance> allObjects = new ArrayList<>();
    allObjects.add(car);
    allObjects.add(cat);
    allObjects.add(health);


for (Insurance ins:allObjects){
    ins.getQuote();
    ins.cancelInsurance();}


        for (int i = 0; i < allObjects.size(); i++) {
            allObjects.get(i).getQuote();
            allObjects.get(i).cancelInsurance();

        }
        System.out.println("*******************");

        allObjects.forEach(s->s.getQuote());
        allObjects.forEach(s-> s.cancelInsurance());

}}
