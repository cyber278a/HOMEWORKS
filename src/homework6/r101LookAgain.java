package homework6;

public class r101LookAgain {

    //Write a for loop that will print out every other letter in a String, starting with the first letter.
    // These letters should be printed all on one line with no space in between.



    public static void main(String[] args) {
        String a="abadura";
        //String b="";

        for (int i = 0; i < a.length(); i+=2) {// incrementing by 2,not checking if even
          //b+=a.charAt(i) ;}
        System.out.println(a.charAt(i));}///or  System.out.println(b)
}}
