package homework6;

import java.util.Scanner;

public class r99 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String str = inp.nextLine();
        //write your code below



        String str1=new StringBuilder(str).reverse().toString();
boolean t=true;
        if(str.equalsIgnoreCase(str1)){
            System.out.println(t);}
        else {
            System.out.println(!t);}
    }
    }

// public static void main(String[] args) {
//    Scanner inp = new Scanner(System.in);
//    System.out.print("In:");
//    String givenString = inp.nextLine();
//   	//write your code below
//