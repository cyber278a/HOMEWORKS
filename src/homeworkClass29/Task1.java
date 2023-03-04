package homeworkClass29;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;

//List<String> aList=new ArrayList<>();
//aList.add("John");
//aList.add("Jane");
//aList.add("James");
//aList.add("Jasmine");
//aList.add("Jane");
//aList.add("James");
//How can you remove all duplicates from ArrayList?
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        LinkedHashSet<String> aList2=new LinkedHashSet<>(aList
        );
        System.out.println(aList2);


    }
}
