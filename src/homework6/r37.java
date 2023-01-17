package homework6;

import java.util.Scanner;

public class r37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean thirsty=input.nextBoolean();
        System.out.println("Are you sleepy?");

        boolean sleepy=input.nextBoolean();
        if (thirsty&&!sleepy) {System.out.println("drink water");
    } else if (thirsty&&sleepy){
            System.out.println("drink coffee");}
        else if (!thirsty&&sleepy){
            System.out.println("drink tea");}
        else {
            System.out.println("drink nothing");}






}}



