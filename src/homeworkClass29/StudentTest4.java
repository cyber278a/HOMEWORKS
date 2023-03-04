package homeworkClass29;
import java.util.HashSet;
import java.util.Set;

//Create a Set collection that will hold Objects of Student Type.
// In this set we do not care about the insertion order.
// Each student object should have name and studentID. Display name of each student.
public class StudentTest4 {
    public static void main(String[] args) {

       // HashSet<Student> students = new HashSet<>();
        Set<Student>students= new HashSet<>();// better than one above

        students.add(new Student("John", "ert56677"));
        students.add(new Student("Steve", "ert56679"));
        students.add(new Student("Andrew", "ert56675"));
        for (Student s : students)
         {s.displayInfo();}


        System.out.println("********************");
        for (Student s:students
             ) {
            System.out.println(s.getName());

        }


    }}




