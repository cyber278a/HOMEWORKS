package homework6;
//Complete the SyntaxTechnologies class:**
//Include the following class variables:
//* schoolName(String)
//* batch(int)
//* year(int)
//* lastDayOfClass(String)
//Write two constructors:
//* non-argument constructor
//* parameterized constructor
//Create method to display values of instance variables.
//**2. In Main Class:**
//
//Create two different objects of the SyntaxTechnologies class using both constructors and call display method.
//
//**Expected Output:**
//
//```
//null 0 0 null
//```
//
//```
//Syntax 6 2020 07/30/2020
public class r142 {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    r142(){

    };

      r142(String schoolName,int batch,int year,String lastDayOfClass){
          this.schoolName=schoolName;
          this.batch=batch;
          this.year=year;
          this.lastDayOfClass=lastDayOfClass;}
        void hel1(){ System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);


      }

    public static void main(String[] args) {
        r142 hello1=new r142();
        hello1.hel1();
r142 hello2=new r142("Syntax",6,2020,"07/30/2020");
hello2.hel1();
    }
}
