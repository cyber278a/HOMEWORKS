package homework6;
//In AnotherClass declare a private, default, protected, public methods and have them
// each return the name of the what access modifier they are using.
//
//All methods should be accessible by class name
//
//Call methods of Another class inside Main class
public class r138 {
    private static void mod1(){
        System.out.println("private");// not gonna work in different class
    }
      static void mod2(){
        System.out.println("default");
    }
    protected static void mod3(){
        System.out.println("protected");
    }
    public static void mod4(){
        System.out.println("public");
    }

    public static void main(String[] args) {
        r138.mod1();
        r138.mod2();
        r138.mod3();
        r138.mod4();
    }
}
