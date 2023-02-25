package homework6;

import java.util.ArrayList;

//Create a array list that will hold Integer Objects:
//
//Add below elements to it.
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
//Print first, third and fifth element from your array
//
//**Expected Output:**
//
//```
//111
//333
//555
public class r184 {
    public static void main(String[] args) {


    ArrayList<Integer> names=new ArrayList<>();
    names.add(111);
    names.add(222);
    names.add(333);
    names.add(444);
    names.add(555);
    names.add(666);
        System.out.println(names.get(0));
        System.out.println(names.get(2));
        System.out.println(names.get(4));

}}
