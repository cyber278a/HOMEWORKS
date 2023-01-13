package homework3;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {
;
        Scanner input=new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        boolean have=input.nextBoolean();
        if(have){
            Scanner input2=new Scanner(System.in);
            System.out.println("What is your balance on the card?");
            int balance=input2.nextInt()
            ;
            if (balance>1000){
                System.out.println("Pay off immediately");}
            else System.out.println("You can spend more");}
else System.out.println("You can get one from us");
        }

}
