package homework4;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number of day of the week");
        int day=scan.nextInt();
        if(day>=1&&day<=5){
            System.out.println("Weekday");}
        else if(day==6||day==7){
            System.out.println("Weekend");}
            else
                System.out.println("Invalid day");

            scan.close();
    }
}
