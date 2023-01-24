package myProject;
//Write a java program to check whether a given number is prime or not?
public class Task7 {
    public static void main(String[] args) {
        int num = 23;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum++;}}
             if(sum==2){
            System.out.println("Prime number");
        }else {
            System.out.println("Not a prime number");}


}}
