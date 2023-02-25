package homework6;

import java.util.ArrayList;

//Create an arrayList of type Integer.
//
//add below values.
//
//111
//
//111
//
//111
//
//999
//
//999
//
//999
//
//Print all the values of List 1 by 1:
//
//**Expected Output:**
//
//```
//111
//111
//111
//999
//999
//999
//```
public class r185 {
    public static void main(String[] args) {
        ArrayList<Integer> names=new ArrayList<>();
        names.add(111);
        names.add(111);
        names.add(111);
        names.add(999);
        names.add(999);
        names.add(999);

        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));

        }

    }
}
