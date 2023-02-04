package homeworkClass15;

public class LargerNumber {
    String BiggerNumber(int num1,int num2){
        if (num1>num2){return num1+" is a larger number";}
        else {return num2+" is a larger number";}
    }
    public static void main(String[] args) {
        LargerNumber ln=new LargerNumber();
        System.out.println(ln.BiggerNumber(6,9));
    }
}
