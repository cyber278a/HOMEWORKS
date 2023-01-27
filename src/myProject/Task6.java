package myProject;
//Write a program to swap 2 numbers without a temporary variable?
public class Task6 {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        a=a+b;//12
        b=a-b;//5
        a=a-b;//7

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
