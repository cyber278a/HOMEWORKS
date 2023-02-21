package homework6;

           //REPLIT 144
// Third constructor all the parameters except category, expiration, and stock (stock default to 0 inside the constructor)
//Step 3: Method for display out put.
//in StoreProduct Class create a method to display the output of class variables. (Output sequence as as order of variable shown above. all in one line)
//Step 4: in Main Class Create an object of StoreProduct Class with each constructors.
//pass the values and then call the display method.
//Step 5: Execute your application :)
//Hint: each variable must be object specific
public class StoreProduct {
    String lable;
    double price;
    String category;
    boolean hasExpiration;
    int stock;
    StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock){
        this.lable=lable;
        this.price=price;
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String lable, double price, int stock){
        this.lable=lable;
        this.price=price;
        this.stock=stock;
        this.category="misc";
        this.hasExpiration=false;
    }
    StoreProduct(String lable, double price){
        this.lable=lable;
        this.price=price;
        this.stock=0;
    }
    public void display(){
        System.out.println(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
    }

    public static void main(String[] args) {
        StoreProduct s1=new StoreProduct("Eggs",3,"Produce",true,10);
        s1.display();
        StoreProduct s3=new StoreProduct("Paper Towels",2,24);
        s3.display();
        StoreProduct s2=new StoreProduct("Paper Towels",2);
        s2.display();
    }
}
