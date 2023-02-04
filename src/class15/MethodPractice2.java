package class15;

public class MethodPractice2 {

//String str="HomeworkTask2";
    // for (int i = str.length()-1; i>=0  ; i--) {
    //  System.out.print(str.charAt(i));}




    String reverseStr(String input){
String newStr="";

    for (int i = input.length()-1; i>=0  ; i--){
        newStr+=input.charAt(i);}// !!!+ collecting letters
        // instead of printing them!!!
return newStr;
//OR
    }
    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }
//OR
    String reverseStr2(String input){
        StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return stringBuilder.toString();}}