package homework6;

import java.util.Iterator;
import java.util.LinkedHashSet;

//Create a Set collection in which you want to preserve an order of inserted String Objects.
//
//Add the below values
//
//- null
//- Sohil
//- Diego
//- Alijon
//- Asel
//- Sumair
//
//
//
//Print values 1 by 1 using loop and Iterator
//
//```
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair
//null
//Sohil
//Diego
//Alijon
//Asel
//Sumair
public class r199 {
    public static void main(String[] args) {
        LinkedHashSet<String> names=new LinkedHashSet<>();
        names.add("null");
        names.add("Sohil");
        names.add("Diego");
        names.add("Alijon");
        names.add("Asel");
        names.add("Sumair");
        for (String n:names
             ) {
            System.out.println(n);

        }
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String number = iterator.next();
            System.out.println(number);
        }



    }
}
