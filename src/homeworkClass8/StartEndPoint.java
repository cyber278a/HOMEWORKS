package homeworkClass8;

import java.util.Scanner;

public class StartEndPoint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter start and end numbers" );
        int start= scanner.nextInt();
        int end= scanner.nextInt();
        int sum1=0;
        int sum2=0;
        for (int i = start; i <=end ; i++) {

           if (i%2==0){sum1=sum1+i;}
               else{sum2=sum2+i;}}
            System.out.println("Sum of even numbers " +sum1);
        System.out.println("Sum of odd numbers "+sum2);


    }
}
