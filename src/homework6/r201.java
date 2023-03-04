package homework6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Create a Map in which you do not need to preserve the order of the entries
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
//Find how many entries are inside the map
//
//Remove all entires from the Map
//
//Find the Map size again
//
//**Expected Output:**
//
//```
//5
//0
public class r201 {
    public static void main(String[] args) {
        Map<String, String> info = new HashMap<>();
        info.put("Street", "Patrick ST");
        info.put("Suite", "265");
        info.put("City", "Vienna");
        info.put("Zip", "22180");
        info.put("Country", "United State");
        System.out.println(info.size());
        info.clear();
        System.out.println(info.size());
    }
}
