package homeworkClass8;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double total=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter an item and price");
            String itemname=scanner.next();
            double itemPrice= scanner.nextDouble();
            total=total+itemPrice;
            System.out.println("That's the total you have to pay "+total);}
        System.out.println("Please pay for the items");
        double amountPaid= scanner.nextDouble();
                 if (amountPaid>total){
                  double change=amountPaid-total;
                     System.out.println("That's your change "+change);}
                 else if (amountPaid<total){
                     System.out.println("You can't buy all the items");}
        System.out.println("Thank you for shopping");




            

    }
}
