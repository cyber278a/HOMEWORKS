package class15;

public class MethodpracticeTester {
    public static void main(String[] args) {


        MethodPractice mp=new MethodPractice();
        boolean isEven=   mp.isEven(15);
        System.out.println(isEven);

        // call iseven method for the numbers 100 12 20
        boolean isEven2=mp.isEven(100);
        System.out.println(isEven2);
        System.out.println(mp.isEven(12));
        System.out.println(mp.isEven(20));


}}
