package homeworklClass17;
//5) Write a Student class   that have instance variables name and address.
// Create a constructor that will initialize those variables.
// Print name & address of given  student using displayInfo method.
public class Student {
    String name;
    String adress;
    Student(String sName,String sAdress){
        name=sName;
        adress=sAdress;}

        void displayInfo(){
            System.out.println("Student name is "+name+" and adress "+adress);}


    public static void main(String[] args) {
        Student s1=new Student("John Smith","100 Main street");
        s1.displayInfo();
    }
    }


