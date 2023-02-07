package homework6;
//Declare 3 instance variables to hold:
//
//year, school name and batch #
//
//Access variables from the main method and assign specific values to them
//
//Print values of your variables in the following format:
//
//**Expected Output:**
//
//```
//I am a student of batch 9 studying at Syntax in the year of 2021
//```
public class r120 {
    int year;
    String schoolName;
    int batch;

    r120(int myYear, String mySchool, int myBatch) {
        year = myYear;
        schoolName = mySchool;
        batch = myBatch;
    }

    void printInfo() {
        System.out.println("I am a student of batch " + batch + " studying at " + schoolName + " in the year of " + year);
    }
    public static void main(String[] args) {

        r120 check = new r120(2021, "Syntax", 9);
        check.printInfo();

    }
}
