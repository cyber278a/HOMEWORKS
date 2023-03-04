package homework6;
//Create a Map that will preserve an order of entry objects
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
//Print all values using iterator
//
//**Expected output:**
//
//```
//Patrick ST
//265
//Vienna
//22180
//United State
//```
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class r204 {
    public static void main(String[] args) {

            Map<String, String> info = new LinkedHashMap<>();
            info.put("Street", "Patrick ST");
            info.put("Suite", "265");
            info.put("City", "Vienna");
            info.put("Zip", "22180");
            info.put("Country", "United State");
            var iterator=info.entrySet().iterator();
            while ( iterator.hasNext()){var entry=iterator.next();
                System.out.println(entry.getValue());}

    }
}
