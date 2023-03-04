package homework6;

import java.util.*;

//Create A Map that will preserve an order of entry objects
//
//Add below pairs :
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
//Print all values of from the map
//
//**Expected Output:**
//
//```
//Patrick ST
//265
//Vienna
//22180
//United State
public class r200 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> info = new LinkedHashMap<>();
        info.put("Street", "Patrick ST");
        info.put("Suite", "265");
        info.put("City", "Vienna");
        info.put("Zip", "22180");
        info.put("Country", "United State");

        var valuesBB=info.entrySet();
        for (var values :valuesBB
        ) {
            System.out.println(values.getValue());
    }
}}
