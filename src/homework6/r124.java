package homework6;
//Declare static variable in class level as below and assign its value:
//
//    String ss="Welcome To Syntax Technologies"
//
//    Access variable in the main method and print it using three ways you learned so far
//
//    Hint:
//
//    first way: By calling directly
//
//    Second way: By using the className
//
//    Third way: By creating the object of the class
public class r124 {
    static String ss="Welcome To Syntax Technologies";



    public static void main(String[] args) {

        System.out.println(ss);
        System.out.println(r124.ss);
r124 hello=new r124();
        System.out.println(hello.ss);

    }}