package homework6;
//Declare two static variables to hold
//
//- country name
//- continent

//Create a method to display the value of static variables in the following format:

//____ located on \_\_\_\_ continent
//
//In the main method assign values to a static variable and execute method display
//**Expected Output:**
//
//```
//Morocco located on Africa continent
//```
public class r129 {

    static String countryName;
    static String continent;

     static void display() {
        System.out.println(countryName+ " located on "+continent+" continent");}

    public static void main(String[] args) {
       countryName="Marocco";
       continent="Africa";
       r129 sd=new r129();
       sd.display();

    }
    }

