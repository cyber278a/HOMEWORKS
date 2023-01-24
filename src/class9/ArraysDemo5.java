package class9;

public class ArraysDemo5 {
    public static void main(String[] args) {
        int number=10;

        int [] numbers= new int[5];
        numbers[0]=45; //45+0
        numbers[1]=44;
        numbers[2]=33; // 45+33=>78
        numbers[3]=20;
        numbers[4]=10;
        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }}}
