package homework6;

import java.util.ArrayList;

//Create an Arraylist of type Integer.
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
//Print the ArrayList.
//
//remove all the elements.
//
//Print the Arraylist.
//
//
//
//**Expected Output:**
//
//```
//[111, 222, 333, 444, 555, 666]
//[]
public class r186 {
    public static void main(String[] args) {
        ArrayList<Integer>  names=new ArrayList<>();
        names.add(111);
        names.add(222);
        names.add(333);
        names.add(444);
        names.add(555);
        names.add(666);
        System.out.println(names);
        names.clear();
        System.out.println(names);
    }
}
