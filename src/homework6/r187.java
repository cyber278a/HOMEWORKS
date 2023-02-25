package homework6;

import java.util.ArrayList;

//Create an array list to type String.
//
//Add these values below to your arraylist
//
//hi
//
//yo
//
//sup
//
//yolo
//
//boop
//
//Remove 1, 3, 5 element from an array
//
//print remained values one by one in one line
//
//**Expected Output:**
//
//```
//yo yolo
public class r187 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("hi");
        names.add("yo");
        names.add("sup");
        names.add("yolo");
        names.add("boop");



    names.removeIf(s -> !s.endsWith("o"));


        for (int i = 0; i < names.size(); i++) {System.out.print(names.get(i)+" ");

        }
        }
    }


