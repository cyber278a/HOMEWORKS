package homework6;
//Create instance variables as below.
//
//- model
//- price,
//- quantity
//
//Create a constructor that will initialize instance variables.
//
//Create a method with name carStockValue. Write logic to calculate the total values of cars in stock and print the result.
//
//run the application in Main Class
//
//**Expected Output:**
//
//```
//Toyota 2019 Stock Value 2500000.0
//BMW 2019 Stock Value 652980.0
public class r147 {
    String model;
    double price;
    int quantity;
    r147(String model,double price,int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }


    double carStockValue(double price,int quantity){double totalValue=quantity*price;return totalValue;}


    public static void main(String[] args) {
        r147 r1=new r147("Toyota 2019",50000,50);

        System.out.println(r1.model+" "+r1.carStockValue(50000,50));
        r147 r2=new r147("BMW 2019",652980,10);
        System.out.println(r2.model+" "+r2.carStockValue(65298,10));
    }

}
