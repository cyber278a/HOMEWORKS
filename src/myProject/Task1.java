package myProject;

import java.util.Scanner;

public class Task1 {
    //Using Scanner create an array of integer values. After the array
    // is created, calculate the sum of all stored elements in that array.


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int sum=0;
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
         sum=sum+arr[i];}
        System.out.println("Sum of all numbers is "+sum);

}}
