package homeworkClass30;

import java.util.HashMap;
import java.util.Map;

// Create a map of Best Buy store. Place
//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.
public class Task1 {
    public static void main(String[] args) {

        Map<Integer,String> bestBuyMap=new HashMap<>();
        bestBuyMap.put(123678,"Laptop");
        bestBuyMap.put(123699,"Camera");
        bestBuyMap.put(123655,"TV");
        bestBuyMap.put(123600,"Desktop computer");
        bestBuyMap.put(123698,"Fridge");

        var valuesBB=bestBuyMap.entrySet();
        for (var values :valuesBB
             ) {
            System.out.println(values.getKey()+" "+values.getValue());

        }






    }

}
