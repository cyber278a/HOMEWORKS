package homeworkClass13;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        String str1 = "orange";
        String str2 = "juice";

        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length()-str2.length());
       str1 = str1.substring(str2.length());

        System.out.println("str1="+str1+" and str2="  +str2);

    }
}