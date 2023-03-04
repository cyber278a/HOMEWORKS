package homeworkClass30;

import java.util.ArrayList;

//Create a collection of integers in which you can keep duplicates.
//Write a logic to find sum of all integers (edited)
//
//5
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(15);
        numbers.add(25);
        numbers.add(5);
        numbers.add(15);
        int sum=0;
        for (int i = 0; i <numbers.size() ; i++) {
sum=sum+numbers.get(i);
        }
        System.out.println(sum);
    }
}
