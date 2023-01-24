package myProject;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    //Using Scanner create an array of countries. //When an array is created, retrieve all values from it and while retrieving those
    // values print capital for each country. (use 2 different loops).
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 countries:France,Italy,Germany,Russia,Poland ");

        String [] arr=new String[5];
        for (int i = 0; i <arr.length ; i++){
            arr[i]=scan.nextLine();
            System.out.println(arr[i]);
            String [] capitals= {"Paris","Rome","Berlin","Moscow","Warsaw"};
            for (int j = 0; j < arr.length; j++){if (j==i){
        System.out.println("The capital of "+arr[i] + " is  "+capitals[j] );}}}}

        }







