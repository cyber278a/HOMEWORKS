package class12;

public class StringDemo12contains {
    public static void main(String[] args) {

        //The contains() method checks whether a string contains a sequence of characters.
        //
        //Returns true if the characters exist and false if not.




        String myStr = "Hello";
        System.out.println(myStr.contains("Hel"));   // true
        System.out.println(myStr.contains("e"));     // true
        System.out.println(myStr.contains("Hi"));    // false
    }
}
