package homework6;

import java.util.Scanner;

public class r95 {
    public static void main(String[] args) {
        //Using Scanner class input string value.
        //
        //Print out the following: "The first 3 letters of \_\_\_ is ___"
        //
        //```
        //For example, if the input is "banana", your output should be: "The first 3 letters of banana is ban".
        Scanner scanner=new Scanner(System.in);
        String word=scanner.next();
        String newStr=word.substring(0,3);
        System.out.println("The first 3 letters of" +word+" is "+newStr );





    }
}
