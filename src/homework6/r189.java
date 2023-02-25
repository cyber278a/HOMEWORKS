package homework6;

import java.util.LinkedList;

//Create a Linked List that will store Integer Objects from 50-100.
//
//Once Linked List is created remove all numbers that are not divisible by 3.
//
//Print Linked List
//
//**Expected Output**
//
//[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
public class r189 {
    public static void main(String[] args) {
        LinkedList<Integer> subjects=new LinkedList<>();
        for (int i = 50; i < 101; i++) {
            subjects.add(i);}
        subjects.removeIf(s  -> s%3!=0 );

        System.out.println(subjects);

    }}

