package class8;

public class NestedLoops8 {
    public static void main(String[] args) {


        /*  0 1 2 3 4 5
           0 2 4 6 8 10
           0 3 6 9 12 15
         */

        for (int i = 0; i < 3; i++) {
            for (int j = i+1; j <=5; j++) {// j=i !!!!!!!!!!!!!!! this part executes ONLY ONCE for inner loop!!!!!


                        System.out.print(j+" ");

                }
            System.out.println();}

        }}








