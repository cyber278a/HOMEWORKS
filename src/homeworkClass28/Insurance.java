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

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote();
     abstract void cancelInsurance();
}
class Car extends Insurance{
    String CarModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        CarModel = carModel;
    }

    @Override
    void cancelInsurance() {
        System.out.println("Can cancel  anytime");

    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" quote is 2000$ a year");

    }
}
class Pet extends Insurance{
    String petType;

    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType = petType;
    }

    @Override
    void getQuote() {
        System.out.println(petType+"'s insurance 580$ a year");

    }

    @Override
    void cancelInsurance() {System.out.println("You can cancel your "+insuranceName+" anytime");

    }
}
class Health extends Insurance{

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {System.out.println("Your health insurance is 3400$ per year");

    }

    @Override
    void cancelInsurance() {System.out.println("You can cancel your " + insuranceName + " anytime with %7 fee");

    }
}
class Test {

    public static void main(String[] args) {
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Car("Geico","BMW"));
        insurances.add(new Pet("Pet love","Cat"));
        insurances.add(new Health("Allianz"));

        for (Insurance i:insurances){
            i.getQuote();
            i.cancelInsurance();
        }
        System.out.println("********************");

   /* Car car=new Car();
    Pet pet=new Pet();
    Health health=new Health();
    ArrayList<Insurance> allObjects = new ArrayList<>();
    allObjects.add(car);
    allObjects.add(pet);
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

    */
}}