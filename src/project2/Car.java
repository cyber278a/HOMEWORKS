package project2;
//3. Create a Class Car that would have the
//    following fields: carPrice and color and method
//    calculateSalePrice() which should be returning a price of the car.
// Create 2 subclasses: Sedan and Truck. The Truck class has a field as weight and has its own
//implementation of calculateSalePrice() method in which returned price is calculated as
// following: if weight>2000 then returned price car should include 10% discount, otherwise 20%  discount.
// The Sedan class has field as length and also-does it its own implementation of calculateSalePrice(): if length of sedan is >20
//    feet then returned car price should include 5% discount, otherwise 10% discount
//
public  abstract class Car {
    double carPrice;
    String color;
   abstract double calculateSalePrice();

    public Car(double carPrice) {
        this.carPrice = carPrice;

    }
}
class Truck extends Car{
    double weight;

    public Truck(double carPrice,  double weight) {
        super(carPrice);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice= carPrice - carPrice *0.1;}else
                carPrice=carPrice - (carPrice *0.2);
        return carPrice;

    }
}

class Sedan extends Car{
    double lenght;

    public Sedan(double carPrice,  double lenght) {
        super(carPrice);
        this.lenght = lenght;
    }

    @Override
    double calculateSalePrice() {if (lenght>20){carPrice= carPrice-carPrice*0.05
            ;}else carPrice= carPrice-(carPrice*0.1);return carPrice;

    }
}
class Test1{
    public static void main(String[] args) {
        Truck truck=new Truck(50000,2400);
        System.out.println(truck.calculateSalePrice());
        Sedan sedan=new Sedan(60000,18);
        System.out.println(sedan.calculateSalePrice());
    }
}
