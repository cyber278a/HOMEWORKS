package homework6;

import java.util.ArrayList;
import java.util.Scanner;

public class r188ArrayListScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Numbers in:");
        ArrayList<Integer>  names=new ArrayList<>();

        names.add(scanner.nextInt());
        names.add(scanner.nextInt());
        names.add(scanner.nextInt());
        names.add(scanner.nextInt());
        names.add(scanner.nextInt());

        for (int i = 0; i <names.size() ; i++) {

            System.out.print(names.get(i)+" ");}



    }}
