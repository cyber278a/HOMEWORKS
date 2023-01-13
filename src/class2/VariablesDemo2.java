package class2;

public class VariablesDemo2 {
    public static void main(String[] args) {
        int numberBox=10;
        numberBox=20;//did'nt print it,changed right after
        System.out.println(numberBox);// overwriting
        numberBox=200;

        System.out.println(numberBox);
       numberBox=30;
        System.out.println(numberBox+20);
    }
}
