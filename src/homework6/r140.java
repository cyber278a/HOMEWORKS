package homework6;
//Create the maxLength method that will accept String array of words
// and return the word with the largest length.

//Method should be visible only within same package!
public class r140 {

       String maxLength (String arr[]){
        int max=0;
        String longest="";
        for (String s:arr){
            if (s.length()>max){
        max=s.length();
        longest=s;}}return longest;}





    public static void main(String[] args) {
        r140 hello=new r140();
String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(hello.maxLength(arr));



        //should print "this is long"
}}
