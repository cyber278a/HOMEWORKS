package class15;

import java.util.Scanner;

public class MethodsDemo1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//  Scanner IS A CLASS
        System.out.println("Please Enter a number");
       int num= scanner.nextInt();// nextInt() is a METHOD
        System.out.println("You entered "+num);

        Methods methods=new Methods();
        // String num2= methods.doSomeThing();
        String c=methods.method2();

    }
}
