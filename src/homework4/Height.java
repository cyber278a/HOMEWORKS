package homework4;

import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height=scan.nextInt();
        if(height<60){
            System.out.println("short");}else
        if(height>=60&&height<=72){
            System.out.println("medium");}else
            if(height>72){
                System.out.println("tall");}

        scan.close();

    }
}
