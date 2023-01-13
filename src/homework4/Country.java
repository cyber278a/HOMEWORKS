package homework4;

import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your country-one of 5-China,USA,France,Germany,Russia");
        String country=scanner.nextLine();
        switch (country) {
            case "China":
                System.out.println("You speak Chinese");
                break;
            case "USA":
                System.out.println("You speak English");
                break;
            case "France":
                System.out.println("You speak French");
                break;
            case "Germany":
                System.out.println("You speak German");
                break;
            case "Russia":
                System.out.println("You speak Russian");
                break;
            default:
                System.out.println("You are not from one of these 5 countries");
                scanner.close();
        }}
}
