package homeworkClass28;

import java.util.ArrayList;
import java.util.function.Predicate;

//5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 500; i+=2) {
            numbers.add(i);}
        numbers.removeIf(s  -> s%5==0 );
        System.out.println(numbers);



    }}


