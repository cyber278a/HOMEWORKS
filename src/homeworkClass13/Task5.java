package homeworkClass13;

////5) How would you check if String is palindrome or not? aba=> true
//       // Abbc =>false
public class Task5 {
    public static void main(String[] args) {
       String str="aba";

        String str1=new StringBuilder(str).reverse().toString();

        if(str.equals(str1)){
            System.out.println("Palindrome");}
        else {
            System.out.println("Not palindrome");}
    }
}


