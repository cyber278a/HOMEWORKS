package homeworkClass28;

import java.util.ArrayList;

//3)Create an arrayList of words. Remove every word that ends with “e”.
public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Hello");
        words.add("Array");
        words.add("There");
        words.add("Here");


        words.removeIf(a -> a.endsWith("e"));
        System.out.println(words);


    }


}