package homework6;
//Create an instance final method that will reverse a String and return that new String
public class r168 {
final static String ret1(String d){
    String str1=new StringBuilder(d).reverse().toString();return str1;

}

    public static void main(String[] args) {
        System.out.println( r168.ret1("hello"));
    }
}
