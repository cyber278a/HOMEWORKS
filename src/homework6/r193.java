package homework6;

import java.util.LinkedList;

//Create Linked List that will store Integer Objects
//
//Add the values below:
//
//111
//
//222
//
//333
//
//444
//
//555
//
//666
//
//Create a logic to calculate sum of the all the values in list.
//
//Print the result of sum.
//
//**Expected Output:**
//
//```
//Result of sum is 2331
//```
public class r193 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);
        int sum=0;
        for (int i = 0; i <numbers.size(); i++) {
         sum=sum+numbers.get(i);
        }
        System.out.println(sum);
        }
    }


