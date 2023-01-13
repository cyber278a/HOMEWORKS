package class5;

public class LogicalOperators1 {
    public static void main(String[] args)
    //      || OR operator
    {
        System.out.println(true||true);
        System.out.println(true|false);
        System.out.println(false||false);
        System.out.println(false||false||true||false);

        boolean boughtCho=true;
        boolean boughtFlowers=true;
if(boughtCho||boughtFlowers){
    System.out.println("I am happy");}
else System.out.println("I am sad");

boolean wifi=true;
boolean fiveG=true;
if (wifi||fiveG) {System.out.println("You are good for browsing internet");}
else System.out.println("Connect to wifi or fiveG");

    }
}
