package homeworkClass30;

import java.util.TreeMap;

//Create a Person class with following private fields: name, lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
public class Test {
    public static void main(String[] args) {
        TreeMap<String,Person> persons=new TreeMap<>();
        persons.put("5555a",new Person("John","Smith",25,90000));
        persons.put("5556a",new Person("Alex","Bird",26,100000));
        persons.put("5557a",new Person("Var","Java",30,110000));
        persons.put("5558a",new Person("Johnny","Smithy",27,120000));
            var entrySet=persons.entrySet();
           for (var personInfo:entrySet
             ) {
            System.out.println("ID "+personInfo.getKey()+" "+personInfo.getValue());

        }

    }
}
class Person{
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
     // generate-> toString()-> add all
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}
