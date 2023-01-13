package homework3;

import java.util.Scanner;

public class FC {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your city");
        String city=input.nextLine();

        Scanner input2=new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit");
       double tempF=input2.nextDouble()
        ;
        System.out.println("Temperature in "+city+" "+(tempF-32)/1.8+ "  Celsius")
;


    }
}
