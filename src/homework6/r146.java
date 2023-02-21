package homework6;
// Complete the Employee.java class:
//
//Include the following class variables:
//
//* name(String)
//
//* lastName(String)
//
//* employeeId(int)
//
//* startDate(String)
//
//* salary(int)
//
//Write two constructors:
//
//* non-argument constructor
//
//* parameterized constructor that will initialize all instance variables
//
//Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.
//
//Output:
//
//
//
//```
//null null 0 null 0
//```
//
//```
//Joe Smith 12345 01/01/1970 35000
//```
public class r146 {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    r146() {
    }

    ;

    r146(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;
    }


    public static void main(String[] args) {
        r146 r1=new r146();
        System.out.println(r1.name+" "+r1.lastName+" "+r1.employeeId+" "+r1.startDate+" "+r1.salary);

        r146 r2=new r146("Joe","Smith",12345,"01/01/1970",35000);
        System.out.println(r2.name+" "+r2.lastName+" "+r2.employeeId+" "+r2.startDate+" "+r2.salary);
    }

}

