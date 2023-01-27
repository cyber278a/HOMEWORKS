package homeworkClass13;

public class Task3 {
    public static void main(String[] args) {
        // You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?
        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] strArr=str.split("[!.?]");
        System.out.println(strArr.length);
        System.out.println("***************");


        // OR


        String str1="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(str1.split("[?]").length);
    }
}
