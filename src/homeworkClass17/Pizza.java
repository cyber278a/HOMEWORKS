package homeworkClass17;

public class Pizza {
    // Write a java class that have 4 constructors with
    // 4 different access levels of constructors(private,public,default,protected)
    // and create 4 objects of this class:
    // 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.


    String shape;
    int quantity;
    char topping1;

    Pizza() {}
    public Pizza(String PizzaShape) {
        shape = PizzaShape;}

    protected Pizza(int PizzaQuantity) {
        quantity = PizzaQuantity;
    }
    private Pizza(char PizzaTopping1) {
        topping1 = PizzaTopping1;
    }
    public static void main(String[] args) {
        Pizza p1=new Pizza();
        Pizza shape=new Pizza("Round");
        Pizza quantity=new Pizza(3);
        Pizza topping=new Pizza('A');

    }

}











