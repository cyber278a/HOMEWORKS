package homeworkClass15;

public class Task2EvenOdd {
    //Create a method that will take a number and prints whether the number is even or odd.
    String oddNumber(int num1) {
        if (num1 % 2 == 0) {
            return num1 + " is Even";
        } else {

            return num1 + " is Odd";
        }
    }

    public static void main(String[] args) {
        Task2EvenOdd EO=new Task2EvenOdd();
        System.out.println(EO.oddNumber(67));
    }

}