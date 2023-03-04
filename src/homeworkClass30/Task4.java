package homeworkClass30;

import java.util.ArrayList;
import java.util.Collections;

//4)Create the collection that will store single uniques
// Objects of a String type in which order is preserved.
//Write a logic to concatenate all string from the collection.
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> theme=new ArrayList<>();

        theme.add("How");
        theme.add("are");
        theme.add("you");
        theme.add("doing");
        theme.add("today?");
        for (String word:theme
             ) {
            System.out.print(word+" ");

        }
    }

}
