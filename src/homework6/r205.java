package homework6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Create a HashMap of String.
//
//Add below pair to it .
//
//"Street" = "Patrick ST"
//
//"Suite" = "265"
//
//"City" = "Vienna"
//
//"Zip" = "22180"
//
//"Country" = "United State"
//
//Print all the values in upper case using entrySet
//
//**Expected Output:**
//
//```
//265
//22180
//PATRICK ST
//UNITED STATE
//VIENNA
//```
public class r205 {
    public static void main(String[] args) {
       Map<String, String> info = new HashMap<>();
        info.put("Street", "Patrick ST");
        info.put("Suite", "265");
        info.put("City", "Vienna");
        info.put("Zip", "22180");
        info.put("Country", "United State");

        var valuesBB=info.entrySet();
        for (var values :valuesBB
        ) {
            System.out.println(values.getValue().toUpperCase());
        }
    }
}
