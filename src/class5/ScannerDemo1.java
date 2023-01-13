package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        System.out.println("what is your gender?");
        char gender=scan.next().charAt(0);

        System.out.println("Your gender is "+gender);

        System.out.println("Please enter your name");
        String name= scan.next();// typing just next if need to enter only one word
        System.out.println("Your name is "+name);

        scan.nextLine();// using when entering different types of data otherwise its read"enter"too
        System.out.println("Please enter your full name");
        String fullName= scan.nextLine();
        System.out.println("Your full name is "+fullName);
        scan.close();// goot practice to close scanner to save memory



    }
}
