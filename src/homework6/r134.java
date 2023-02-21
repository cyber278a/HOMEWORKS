package homework6;

public class r134 {
    //Write a method with the following specs:
    //Returns:
    //an integer
    //Name:
    //countVowels
    //Parameters:
    //a String called s
    //Purpose:
    //count the number of vowels in the string s.  Assume s is all lowercase.
    //Examples:
    //countVowels("obama") ==> 3
    //countVowels("happy friday! i love weekends") ==> 9




    int countVowels (String s) {


        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {

                count++ ; }}
        return count;}

    public static void main(String[] args) {
        r134 hello=new r134();
        System.out.println(hello.countVowels("happy friday! i love weekends"));

    }







    }



