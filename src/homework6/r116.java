package homework6;

public class r116 {
    //Create a method that will accept 2 numbers as parameters and return true if both numbers are even otherwise returned false
    //
    //( Return false if one or both given numbers are not even)



    boolean true1(int num1, int num2) {

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            return true;
        } else {
            return false;}
    }

    public static void main(String[] args) {

        r116 check = new r116();
        System.out.println(check.true1(13, 7));

    }}
