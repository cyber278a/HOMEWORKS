package class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="jdnfkfd 34982342343434 ^*%*";
        int counter=0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isAlphabetic(str.charAt(i))){//if(Character.isDigit(str.charAt(i))){ - counts numbers
                counter++;
            }
        }
        System.out.println("Total isAlphabetic in Str "+counter);
    }
}
