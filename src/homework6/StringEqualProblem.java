package homework6;

import java.util.Scanner;

public class StringEqualProblem {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two strings");
        System.out.println("Please enter two numbers");
        String word1=input.next();
        String word2=input.next();
        int n1=input.nextInt();
        int n2=input.nextInt();

        if(n1==n2&&word1.equals(word2)){
            System.out.println("AND");}
        else if (n1==n2||word1.equals(word2)){
            System.out.println("OR");}
        else
         if (n1!=n2&&word2!=(word1)){//!!!!!!!!  inserted != for the string,normally insert equal
            System.out.println("NONE");}






    }}
