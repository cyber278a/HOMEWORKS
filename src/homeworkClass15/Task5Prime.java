package homeworkClass15;

public class Task5Prime {
    String checkPrime(int num) {


        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                sum++;}
        }
        if (sum == 2) {
            return "Prime number";
        } else {
            return
                    "Not a prime number";}
    }
    public static void main(String[] args) {
        Task5Prime mp = new Task5Prime();
        System.out.println(mp.checkPrime(7));

    }
}
/*
/*Write a method to return whether given number is prime or not?
    return type => boolean
    name=> isPrime
    parameter => int number

boolean isPrime(int number){

    boolean flag=true;
    if (number>1){
        for (int i = 2; i < number; i++) {
            if (number%i==0) {
                flag = false;
                break;
            }
        }

    }else {
        flag = false;
    }
    return flag;

}

    public static void main(String[] args) {
        Task5 task5=new Task5();
        System.out.println(task5.isPrime(13));
    }
 */