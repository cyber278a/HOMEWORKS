package homework6;

public class r130 {
//Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element based on whether it's even or odd.
// If the number is even, divide it by 2.  If it's odd, multiply it by 10.
//**Expected Output:**```
//10 1 30 2 50



    static void mystery(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {

                System.out.print(a[i] / 2);
            }
            if (a[i] % 2 != 0) {
                System.out.print(a[i] * 10);
            }
            System.out.print(" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);

}}




