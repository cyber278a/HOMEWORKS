package class5;

public class LogicalOperators {
    public static void main(String[] args) {
//Logical operators only work with BOOLEAN!!!
        // there are 3 logical operators
        // !  not operator
        // ||
        // &&
        System.out.println(!true);// changing true to false,changing false to true
        System.out.println(!false);
        boolean rich=true;
        System.out.println(!rich);
        //1 2 3 4 5 6 7 8 9    15
        int number=9;
        if(number!=1){
            System.out.println("Hello Java");}
        else System.out.println("Hello World");

String country="China";
        if(!country.equals("BadCountry")){
            System.out.println("You are welcome");}

        String name="Adam";
        int age=50;
        if(name.equals("Adam")&&age==30){
            System.out.println("You are Adam from batch14");}
        else System.out.println("I don't know you");

        boolean isTrue=false;
        if(!isTrue){
            System.out.println("You got it");}
        else System.out.println("Need more practice");
    }
}
