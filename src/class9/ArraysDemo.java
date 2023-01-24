package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String [] names2=new String [5];
        names2[0]="Sergey";
        names2[1]="Alex";
        names2[2]="Emil";
        names2[3]="Ross";
        names2[4]="Steve";


        String [] names={"Slava","Safi","Jason","Nabi","Anees","Joseph"};

        ;
        System.out.println(names[4]);
        System.out.println(names[3]);
        System.out.println(names[5]);
        // System.out.println(names[500]); error because there is no name on index number 500
        // System.out.println(names[-5]); error because index can't be negative
        // write a loop to print all the names from array
        for (int i = 0; i <=6; i++) {
            System.out.println(names[i]);
        }
    }
}
