package homework4;

import java.util.Scanner;

public class MonthOfBirth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your month of birth (Month)");
        String month=scanner.nextLine();
         switch (month){
             case "December":
             case "January":
             case "February":
                 System.out.println("You were born in a winter");
                 break;
             case "March":
             case "April":
             case  "May":
                 System.out.println("You were born in a spring");
                 break;
             case "June":
             case "July":
             case "August":
                 System.out.println("You were born in a summer");
                 break;
             case "September":
             case "October" :
             case "November":
                 System.out.println("You were born in a fall");
                break;
             default:
                 System.out.println("Something went wrong. Try again");}
        scanner.close();


    }
}
