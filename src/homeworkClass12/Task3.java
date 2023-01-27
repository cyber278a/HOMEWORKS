package homeworkClass12;

import java.util.Scanner;
//3) Write a program that reads two people's first
//names and if they expecting boy or girl?
//Based on the input suggests a name for a baby:
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? boy
//Suggested baby name: DANRY
//
//Example Output:
//Mom’s first name? Mary
//Dad’s first name? Daniel
//Boy or Girl? girl
//Suggested baby name: MAIEL
public class Task3 {
    public static void main(String[] args) {
       /* Scanner scanner=new Scanner(System.in);
        System.out.println("Who do you expecting-boy or girl?");
        String gender=scanner.next();
        System.out.println("Please enter Mom’s first name ");
        String mom=scanner.next();
        System.out.println("Please enter Dad’s first name ");
        String dad=scanner.next();

        if( gender.equalsIgnoreCase("boy")){
            System.out.println("Suggested name is "+(dad.substring(0,2))+mom.substring(2)) ;}
        else if ( gender.equalsIgnoreCase("girl")) {
            System.out.println("Suggested name is "+(mom.substring(0,2))+dad.substring(3));}*/

        System.out.println("*******************************");


       // better approach

        String firstHalf;
        String secondHalf;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Who do you expecting-boy or girl?");
        String gender=scanner.next();
        System.out.println("Please enter Mom’s first name ");
        String momsName=scanner.next();
        System.out.println("Please enter Dad’s first name ");
        String dadsName=scanner.next();

        if( gender.equalsIgnoreCase("boy")){
            firstHalf=dadsName.substring(0,dadsName.length()/2);
            secondHalf=momsName.substring(momsName.length()/2);
        }else {
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(dadsName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);





    }}

