package homework4;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your quiz score");
        int quiz=input.nextInt();
        System.out.println("Enter your mid term score");
        int midTerm=input.nextInt();
        System.out.println("Enter your final score");
        int finalScore=input.nextInt();

        int average=(quiz+midTerm+finalScore)/3;
        if (average>=90){
            System.out.println("Grade=A");}
        else if(average>=70&&average<90) {System.out.println("Grade=B");}
        else if(average>=50&&average<70){
            System.out.println("Grade=C");}
        else if(average<50){
            System.out.println("Grade=F");};
        input.close();







    }
}
