package homework6;

import java.util.HashMap;

//Create a Hash Map of String pairs
//
//add the follow values
//
//map.put("ONE","AAA");
//
//map.put("TWO","BBB");
//
//map.put("THREE","CCC");
//
//map.put("FOUR","DDD");
//
//map.put("FIVE","EEE");
//
//Using entry set print key and values pairs using loop
//
//Remove below from Map
//
//"ONE"
//
//"FOUR"
//
//Using entry set print key and values pairs using loop
//
//**Expected Output:**
//
//```
//HashMap Before Remove :
//FIVE : EEE
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : CCC
//------------------
//HashMap After Remove :
//FIVE : EEE
//TWO : BBB
//THREE : CCC
public class r206 {
    public static void main(String[] args) {
        HashMap<String, String> info = new HashMap<>();
        info.put("ONE","AAA");
        info.put("TWO","BBB");
        info.put("THREE", "CCC");
        info.put("FOUR","DDD");
        info.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        var valuesBB=info.entrySet();
        for (var values :valuesBB
        ) {
            System.out.println(values.getKey()+" : "+values.getValue());

        }
        System.out.println("------------------");
        System.out.println("HashMap After Remove :");
        info.remove("ONE");
        info.remove("FOUR");
        for (var values :valuesBB
        ) {
            System.out.println(values.getKey()+" : "+values.getValue());}

    }
}
