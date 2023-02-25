package homeworkClass28;

import java.util.ArrayList;

//2)Create an arraylist of cars and retrieve all the values using 3 different ways.
public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Nissan");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars);
        System.out.println("**********");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("**********");
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
