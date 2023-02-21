package homework6;

public class r128MixedString {
//Create a static method with the following specifications
//Return Type: String
//Method Name: mixString
//Parameters:
//- a String called s1
//- a String called s2
//Then inside method write logic that will return the strings combined, one letter at a time, starting with s1.  See example below for an example.
//NOTE: s1 and s2 should be of equal lengths:

//s1 ==> "12345"`
//s2 ==> "abcde
//mixString(s1,s2) ==> "1a2b3c4d5e"
 static String mixString(String s1,String s2){
     StringBuilder sb=new StringBuilder();
     for (int i = 0; i < s1.length(); i++) {
         sb.append(s1.charAt(i));
         sb.append(s2.charAt(i));
     }
     String mix=sb.toString();{return mix;}
 }

    public static void main(String[] args) {
        System.out.println(mixString("12345","abcde"));
    }}
