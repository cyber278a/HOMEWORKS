package homework6;
//Create Hash Map.
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
//Using EntrySet print the key and values pairs using iterator only
//
//replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//
//Using EntrySet print the key and values pairs using iterator only
//
//OUTPUT
//
//
//
//```
//HashMap Before Replace :
//FIVE : EEE
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : CCC
//------------------
//HashMap After Replace :
//FIVE : SUMAIR
//ONE : AAA
//FOUR : DDD
//TWO : BBB
//THREE : ASEL
import java.util.HashMap;

public class r207 {
    public static void main(String[] args) {
        HashMap<String, String> info = new HashMap<>();
        info.put("ONE","AAA");
        info.put("TWO","BBB");
        info.put("THREE", "CCC");
        info.put("FOUR","DDD");
        info.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");

        var iterator=info.entrySet().iterator();
        while ( iterator.hasNext()){var entry=iterator.next();

            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("------------------");
        System.out.println("HashMap After Replace :");
info.replace("THREE","ASEL");
         info.replace("FIVE", "SUMAIR");

        var iterato=info.entrySet().iterator();
        while ( iterato.hasNext()){var entry=iterato.next();

            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
