package homework6;

import java.util.Scanner;

public class r104ScannerArray {
    public static void main(String[] args) {
        //Create an array of names that will hold 5 String elements.
        //Names must be taking from a user.
        //Print out the first three characters of each element of the array, one per line.
        //Note: every array element must be at least 3 characters long.
        Scanner scanner=new Scanner(System.in);
        String [] arr=new String[5];

            for (int i = 0; i < 5; i++) {
                System.out.println("Enter names: ");
                arr[i] = scanner.next();
            }

            for (int i = 0; i < 5; i++) {
                String arr1  = arr[i].substring(0, 3);
                System.out.println(arr1);
            }








    }
}
