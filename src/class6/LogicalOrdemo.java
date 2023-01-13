package class6;

import java.util.Scanner;

public class LogicalOrdemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What day today?");

        String day=scanner.nextLine();{// or just next.
        if (day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")){//no case sencitive
            System.out.println("No class today");}
        else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Java class enjoy");}
        else if (day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")){
            System.out.println("Manual testing class");}
        else if (day.equalsIgnoreCase("Thursday")) {
            System.out.println("Review class");

        }else {
            System.out.println("Wrong day entered");}


    }scanner.close();
    }
}
