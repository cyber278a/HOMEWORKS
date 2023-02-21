package homework6;

import java.util.Scanner;

public class r32IfDoAgain {
    public static void main(String[] args) {

        // Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"

        // You have 2 conditions:

        //  If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"

        //   If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
        //   ! NEED TO MOVE AGE OUT
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        String gender = scanner.next();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();


          if ( gender.equals("M")) {
            if (age >25){

                System.out.println("Man");}else {

              System.out.println("Boy");}}

        if ( gender.equals("F")) {
            if (age >25){

                System.out.println("Woman");}else {

                System.out.println("Girl");}}





            }}