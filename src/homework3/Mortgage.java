package homework3;

public class Mortgage {
    public static void main(String[] args) {
        double mortgageRate = 3.2;
        int price = 195000;
        if (mortgageRate > 4.5) {
            System.out.println("I am not buying this house");

        } else {
            System.out.println("i will buy this house");
            if(price>200000){
                System.out.println("I will take a loan");}
            else{
                System.out.println("I will pay with cash");}
        }
    }                             }






