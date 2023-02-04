package homework6;

import java.util.Scanner;
//lWrite a program that will print out only vowels of that string
public class r105 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        System.out.println(word.replaceAll("[^AEIOUaeiou]",""));
    }
}
