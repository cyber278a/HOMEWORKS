package homework6;

import java.util.LinkedHashSet;

//Create a Set and and below values to it.
//
//[third, first, second]
//
//Print HashSet and then remove all the elements from Hashset and print it again.
//
//**Expected Output:**
//
//```
//[third, first, second]
//[]
//```
public class r196 {
    public static void main(String[] args) {
        LinkedHashSet<String> num=new LinkedHashSet<>();
        num.add("third");
        num.add("first");
        num.add("second");
        System.out.println(num);
       num.removeAll(num);
        System.out.println(num);

    }
}
