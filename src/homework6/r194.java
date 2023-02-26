package homework6;
//Create a method that takes a list as a paramter removes an element if it starts with letter A from given List and return new List then in the main method print that list.
//
// **Expected Output:**
//
//```
//[USA, Kazakhstan, Pakistan, Russia]
//```
import java.util.LinkedList;
import java.util.List;

public class r194 {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");
        countries.removeIf(a -> a.startsWith("A"));
        System.out.println(countries);
    }
    }

