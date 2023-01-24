package myProject;
//Write a Java Program to print the first 10 numbers of Fibonacci series.
// 0,1,1,2,3,5,8,13,21,34
public class Task8 {
    public static void main(String[] args) {
        int n1=0;
         int n2=1;
         System.out.print(n1+" "+n2);
        for (int i = 2; i < 10; i++) {
            int nextNumber=n1+n2;
            n1=n2;
            n2=nextNumber;
            System.out.print(" "+nextNumber);


    }}
}
