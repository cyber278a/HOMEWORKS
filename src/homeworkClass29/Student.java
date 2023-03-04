package homeworkClass29;
//Create a Set collection that will hold Objects of Student Type.
// In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.
public class Student {
    private String name;
    private String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    void displayInfo(){
        System.out.println(name);
    }
}
