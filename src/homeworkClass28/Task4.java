package homeworkClass28;

import java.util.ArrayList;

//4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();

       drinks.add("soda");
       drinks.add("milk");
       drinks.add("beer");
       drinks.add("icedTea");

            for (int i = 0; i <drinks.size() ; i++) {
                if(drinks.get(i).contains("a")||drinks.get(i).contains("e")) {
                    drinks.set(i,"water");
                }
            }
            System.out.println(drinks);

}}
