package homework6;
//Complete the Dog.java class:
//Create following class variables.
//dogName
//dogWeight
//static dogBreed=Mutt;
//For all methods and variables use proper naming convention.
//Create constructor to initialize instance variables
//2. In Main class Create 2 Objets of a Dog class and using each object reference variable print details of objects.



//                  REPLIT 145 DOESNT WORK FROM OTHER CLASS


public class Dog {

    String dogName;
    double dogWeight;
       static String dogBreed;// SHOULD BE static String dogBreed="Mutt"


    Dog(String dogName, String dogBreed, double dogWeight) {
        this.dogName = dogName;
        this.dogWeight = dogWeight;
        this.dogBreed="Mutt";

    }
    public static void main(String[] args) {


        Dog d1 = new Dog("Tarzan",dogBreed,50);
        System.out.println(d1.dogName+" "+dogBreed+" "+d1.dogWeight);

        Dog d2 = new Dog("Lucy",dogBreed,  10);
        System.out.println(d2.dogName+" "+dogBreed+" "+d2.dogWeight);
    }}