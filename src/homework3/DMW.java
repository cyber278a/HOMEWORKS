package homework3;

import java.util.Scanner;

public class DMW {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("We will issue a driver license to you");}
            else {
            System.out.println("You can get a learner permit if you want");}

    }
}
