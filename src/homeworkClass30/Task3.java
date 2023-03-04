package homeworkClass30;

import java.util.HashMap;
import java.util.Map;

//Create a Map that will store Employee name and salary.
// Write a logic to retrieve an employee who gets the highest salary.
// Output should be in the below format
//John Smith=$100000
public class Task3 {
    public static void main(String[] args) {


        Map<String, Double> employee = new HashMap<>();
        employee.put("John",90000.0);
        employee.put("Alex",100000.0);
        employee.put("Andrew",110000.0);
        employee.put("Alexa",120000.0);

        var entrySet=employee.entrySet();
        double highestSalary=0;
String name="";
        for (var personInfo:entrySet){
       if (personInfo.getValue()>highestSalary){
           highestSalary=personInfo.getValue();
           name=personInfo.getKey();
       }
       }
        System.out.println(name+"="+highestSalary);




    }
}
