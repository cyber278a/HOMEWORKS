package homework6;

import java.util.HashMap;
import java.util.TreeMap;

public class r202 {


   // Create Map in which we want to store keys in Ascending order
        //
        //Add the below values
        //
        //1 item = apple
        //
        //2 item = banana
        //
        //3 item = pear
        //
        //4 item = tomato
        //
        //5 item = mango
        //
        //6 item: kiwi
        //
        //Extract all keys and it values and print them in the format below:
        //
        //**Expected Output:**
        //
        //```
        //Key is 1 item and values is apple
        //Key is 2 item and values is banana
        //Key is 3 item and values is pear
        //Key is 4 item and values is tomato
        //Key is 5 item and values is mango
        //Key is 6 item and values is kiwi
        //```
   public static void main(String[] args) {


       TreeMap<String,String> fruit=new TreeMap<>();
       fruit.put("1 item","apple");
       fruit.put("2 item","banana");
       fruit.put("3 item","pear");
       fruit.put("4 item","tomato");
       fruit.put("5 item","mango");
       fruit.put("6 item","kiwi");
       var Entry=fruit.entrySet();
       for (var hey:Entry
            ) {
           System.out.println("Key is "+hey.getKey()+" and values is "+hey.getValue());

       }


    }
}
