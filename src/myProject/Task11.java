package myProject;
//)Write a program to print out duplicate elements from an Array of Strings?
public class Task11 {
    public static void main(String[] args) {
        String[] cars = {"BMW","Mercedes","Mazda","Nissan","Volvo","Ford","BMW"};
        for (int i = 0; i < cars.length; i++) {
            for (int j = i+1; j < cars.length; j++) {
                if (cars[i].equals(cars[j])) {

                    System.out.println(cars[i]+" is a duplicate");}
                }

            }
        }}

