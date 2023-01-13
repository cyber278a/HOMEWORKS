package homework3;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("How many years did you work?");
        int years = input1.nextInt();


        System.out.println("What is your salary?");
        int salary = input1.nextInt();
        if (years >= 5) {{
            System.out.println("Your are eligible for bonus");
        }

        if (salary > 50000) {
            System.out.println("Your bonus is 5000");
        } else System.out.println("Your bonus is 3000");}



        else System.out.println("Your are not eligible for bonus");
    }

    }





