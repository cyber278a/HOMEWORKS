package homeworkClass17;
//)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
// Inside your class also have a method to Calculate Average Grade.
// Test Student class for 5 different students with different marks.
// Your program should print an average mark of each students name.
//NOTE: please use different names for instance and local variables.
public class Students {
    String name;
    int mathGrade;
    int historyGrade;
    int geographyGrade;

    Students(String StudentsName,int StudentsMathGrade,int StudentsHistoryGrade,int StudentsGeographyGrade ){
        name=StudentsName;
        mathGrade=StudentsMathGrade;
        historyGrade=StudentsHistoryGrade;
        geographyGrade=StudentsGeographyGrade;

    }
void  averageGrade(){int average=(mathGrade+historyGrade+geographyGrade)/3;
    System.out.println("Average score of " +name+" is "+average);}

    void printInfo(){
        System.out.println("Name "+name+" Math="+mathGrade+" History="+historyGrade+" Geography="+geographyGrade);}



}
