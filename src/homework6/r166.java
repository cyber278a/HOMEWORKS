package homework6;
//Create a class Animal in which define instance variable type, constructor that will initialize instance variables and 2 methods eat and sleep.
//
//Create a subclass Cat in which override method sleep
//
//Create 3 Kitten subclasses of a Cat class and override method eat
//
//for 1 kitten - eats milk
//
//for 2 kitten - eats snack
//
//for 3 kitten - eats everything
//In main method create object of Cat class and all 3 kittens classes and store into an array of Animals. Call available methods:
//
//**Expected Output:**
//Cat eats
//Cat sleeps a lot
//kitten1 eats milk
//kitten1 sleeps a lot
//kitten2 eats snacks
//kitten2 sleeps a lot
//kitten3 eats everything
//kitten3 sleeps a lot
//```
public class r166 {
}
class Animal2{

    String name;

    public Animal2(String name) {
        this.name = name;
    }



    void sleep(){}
        void eat(){}
    }

    class Cat2 extends Animal2{
        public Cat2(String name) {

            super(name);
            this.name=name;
        }
        void sleep(){
            System.out.println(name+" sleeps a lot");
        }
        @Override
        void eat(){
            System.out.println(name+" eats");
        }
}



class Kitten1 extends  Cat2{
    public Kitten1(String name) {
        super(name);
    }
    @Override
    void eat(){
        System.out.println(name+" eats milk");
    }
}
class Kitten2 extends  Cat2{
    public Kitten2(String name) {
        super(name);
        this.name=name;
    }
    @Override
    void eat(){
        System.out.println(name+" eats snacks");
    }
}
class Kitten3 extends  Cat2{
    public Kitten3(String name) {
        super(name);
        this.name=name;
    }
    @Override
    void eat(){
        System.out.println(name+" eats everything");
    }
}
class Test7{
    public static void main(String[] args) {
        Cat2 c=new Cat2("Cat");
        Kitten1 k1=new Kitten1("kitten1");
        Kitten2 k2=new Kitten2("kitten2");
        Kitten3 k3=new Kitten3("kitten3");
Animal2 [] animals={c,k1,k2,k3};
for (Animal2 animal:animals){
    animal.eat();
    animal.sleep();
}


          /*  c.eat();
            c.sleep();
            k1.eat();
            k1.sleep();
            k2.eat();
            k2.sleep();
            k3.eat();
            k3.sleep();*/


    }
}