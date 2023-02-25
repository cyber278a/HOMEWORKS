package homework6;

public class r179 {
}
//Create Class EncapsulationDemo that will have 2 variables empName and empAge;
//Create the getter/setter methods for each variable.
//
//In Main Class and main method
//
//Using setter methods assign the values as "Mario" and "32"
//
//Using getter methods print the values as below outputs.
//
// **Expected Output:**
//
//```
//Employee Name: Mario
//Employee Age: 32
//```
class EncapsulationDemo1{
    private String empName;
    private int empAge;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

}
class Main8{
    public static void main(String[] args) {

EncapsulationDemo1 ed1=new EncapsulationDemo1();
ed1.setEmpName("Mario");
        ed1.setEmpAge(32);
        System.out.println("Employee Name: "+ed1.getEmpName());
        System.out.println("Employee Age: "+ed1.getEmpAge());
    }
}