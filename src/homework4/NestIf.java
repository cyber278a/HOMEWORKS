package homework4;

import java.util.Scanner;

public class NestIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 different numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();


            if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the bigger number");}}
            if (num2 > num1) {
                if (num2 > num3) {
                System.out.println(num2 + " is the bigger number");}}
            if(num3>num1){
              if ( num3>num2){
                  System.out.println(num3+ " is the bigger number");}}




    }}







