package myProject;
//Write a program to swap 2 numbers without a temporary variable?
public class Task6 {
    public static void main(String[] args) {
        int a=11;
        int b=32;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
