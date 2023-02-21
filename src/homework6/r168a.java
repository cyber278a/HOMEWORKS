package homework6;

public class r168a {
    final static void  ret1(String a){
        String str1=new StringBuilder(a).reverse().toString();
        System.out.println(str1);
    }

    public static void main(String[] args) {
       r168a.ret1("hello");

    }
}
