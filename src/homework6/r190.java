package homework6;

import java.util.LinkedList;
//Create Linked List that will store first 10 numbers of fibonacci series
//
//Print number from Linked List 1 by 1 all in 1 line
//
//**Expected Output:**
//
//```
//0 1 1 2 3 5 8 13 21 34
//```
public class r190 {
    public static void main(String[] args) {


            LinkedList<Integer> fibNumbers=new LinkedList<>();

            fibNumbers.add(0);
            fibNumbers.add(1);

            int a = 0;
            int b = 1;
            for (int i = 2; i < 10; i++) {
                int next = a + b;
                fibNumbers.add(next);
                a = b;
                b = next;}

            for (int c : fibNumbers) {
                System.out.print(c + " ");
            }
    }
}
