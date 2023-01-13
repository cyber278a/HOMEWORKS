package homework4;

import java.util.Scanner;

public class Grade2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your grade using upper case letter");
        char grade=scan.next().charAt(0);

        switch (grade){
            case 'A':
                System.out.println("A-Excellent");
                break;
            case 'B':
                System.out.println("B-Good");
                break;
            case 'C':
                System.out.println("C-Average");
                break;
            case 'D':
                System.out.println("B-Bad");
                break;
            default:
                System.out.println(grade+" Not acceptable");}
    }
}
