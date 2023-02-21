package homework6;

public class r146a {
    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;

    r146a() {
    }



    r146a(String name, String lastName, int employeeId, String startDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startDate = startDate;
        this.salary = salary;}

void displayInfo(){System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);}

    public static void main(String[] args) {
        r146a r1=new r146a();
        r1.displayInfo();

        r146a r2=new r146a("Joe","Smith",12345,"01/01/1970",35000);
        r2.displayInfo();
    }

}
