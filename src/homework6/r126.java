package homework6;
//Create a variable that will hold the count of all instances of the Main class
//
//Create 3 Object of the class and print value of the count variable;
public class r126 {

    static int count = 0;

     r126() {
        count++;
    }
    static int sum() {
        return count;
    }

    public static void main(String[] args) {

        r126 s1 = new r126();
        r126 s2= new r126();
        r126 s3 = new r126();
        System.out.println(r126.sum());

    }
}
