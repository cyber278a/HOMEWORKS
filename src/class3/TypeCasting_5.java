package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {
        long number=125;
        //byte shorterNumber=number; doesnt run like this
        byte shorterNumber=(byte) number;//works this way.  This is type casting

        float f=10.5f;
        int num=(int)f;
        System.out.println(shorterNumber);
        System.out.println(num);

        byte b=10;
        int number2=b;// from small to big is ok
       // short c=number2; from big to small Java complains
        short c=(short) number2;

        float eggs=12.5f;
        int wholePart=(int)eggs;//type casting
        System.out.println(wholePart);



    }
}
