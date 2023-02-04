package homeworkClass15;

public class Task3Palindrom {
    String checkPal(String str5) {

        String str1=new StringBuilder(str5).reverse().toString();

        if(str5.equals(str1)){
            return str5+" is Palindrome";}
        else {
            return str5+" is not Palindrome";}
    }

    public static void main(String[] args) {
        Task3Palindrom mp=new Task3Palindrom();
        String a= mp.checkPal("anyword");////optional
        System.out.println(mp.checkPal("aba"));
    }}
/*          // !!!Using void if need just to print something!!!!!

          void isPalindrome(String str){
        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+"Not is palindrome");
        }
    }


    public static void main(String[] args) {
        Task3 task3=new Task3();
     // String resut=  task3.isPalindrome("Kaya"); can't assign void methods to variables
      //  System.out.println(task3.isPalindrome("Kaya")); can't use void methods in PrintLn
        task3.isPalindrome("kaya");                */







