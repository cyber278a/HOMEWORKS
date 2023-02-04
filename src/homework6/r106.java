package homework6;
//Instantiate and StringBuffer class
//
//Append Value "Hello" to it
//
//Append value "World" to it.
//
//Print in UPPERCASE.
public class r106 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("Hello");
        sb.append(" World");
String a=sb.toString().toUpperCase();
        System.out.println(a);
    }
}
