package homeworkClass29;

import java.util.LinkedHashSet;

//reate a Set of cities in which you want to make sure that insertion order is maintained.
// Then remove any city that starts with “A”;
public class Task3 {
    public static void main(String[] args) {


    LinkedHashSet<String> cities=new LinkedHashSet<>();
    cities.add("Detroit");
    cities.add("Boston");
    cities.add("Vegas");
    cities.add("Adelaida");
    cities.add("Chicago");
        cities.removeIf(s  -> s.startsWith("A") );
        System.out.println(cities);






}}
