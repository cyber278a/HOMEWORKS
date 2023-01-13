package homework3;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("What the amount of loan you need?");
        int loan=input.nextInt();
         if (loan<=200000){
             System.out.println("You will get this loan");}
             else {
             System.out.println("You are rejected");}
    }
}
