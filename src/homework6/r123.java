package homework6;

import java.util.Scanner;

public class r123 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your month of birth (Month)");
        String month=scanner.nextLine();
        switch (month){
            case "December":
                System.out.println("You were born in a winter");
                break;
            case  "May":
                System.out.println("You were born in a spring");
                break;
            case "August":
                System.out.println("You were born in a summer");
                break;

            default:
                System.out.println("Something went wrong. Try again");}

}}
