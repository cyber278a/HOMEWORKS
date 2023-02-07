package homework6;
//Ask the user to enter any number
//
//if a user enters a number and it is even, print "Value is even",
// after that it should check if the number is greater than 1000 it
// should also print even number is large otherwise even value is just right.
// if number is not even it should print number is odd after that it should check
// if odd number is greater than 1000 it should say odd value is large otherwise odd value is just right
import java.util.Scanner;

public class r33 {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if (number%2==0){
            System.out.println("Value is even");
            if (number>1000){
                System.out.println("Even value is large");}else
                    System.out.println("Even value is just right");}
        else if (number%2!=0){
            System.out.println("Value is odd");
            if(number>1000){
                System.out.println("odd value is large");}else
                System.out.println("Odd value is just right");}



}}
