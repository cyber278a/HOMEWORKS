package homework6;
//Create Class EncapsulationDemo
//
//create two variable as shown below.
//
//private String empName=John;
//
//private int empAge=30;
//
//Create only getters methods for each variable.
//
//Print the values of each variable as shown below.
//
//**Expected Output:**
//
//```
//Employee Name: John
//```
//
//```
//Employee Age: 30
//```
public class r180 {
}
class EncapsulationDemo3{
    private String empName="John";
    private int empAge=30;

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }



}

class Main9 extends EncapsulationDemo3{
    public static void main(String[] args) {


    Main9 m9=new Main9();
        System.out.println("Employee Name: "+m9.getEmpName());
        System.out.println("Employee Age: "+m9.getEmpAge());
    }}