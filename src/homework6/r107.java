package homework6;
//How would you reverse a String using StringBuffer Class
public class r107 {
    public static void main(String[] args) {
        String str="Hello Friends";
        String str1=new StringBuilder(str).reverse().toString();
        System.out.println(str1);
    }
}
