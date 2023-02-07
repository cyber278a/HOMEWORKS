package homework6;
/*Step1: Create three methods that will accept 2 in parameters on integer type

Step2: Write the logic in methods to perform actions below:

The first method for multiplication

The second method for addition

The third method for subtraction

Step3: execute all methods

1. for the addition method add two numbers to make 30

2. for multiplication multiply two numbers to make 30

3. for Subtraction subtract two numbers to equal 20 */

public class r114 {
    void add(int num1, int num2) {
        System.out.println("Addition " + (num1 + num2));
    }

    void mult(int num1, int num2) {
        System.out.println("Multiplication " + (num1 * num2));
    }

    void subt(int num1, int num2) {
        System.out.println("Subtraction " + (num1 - num2));
    }

    public static void main(String[] args) {

        r114 r114 = new r114();
        r114.add(15, 15);
        r114.mult(3, 10);
        r114.subt(30, 10);
    }}