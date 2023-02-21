package homework6;
//In main class please declared the variables using different access modifiers that will hold value for:
//
//- name
//- city
//- name of the school
//- batch number
//
//Create a method to display details in following format:
//
//My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_
//
//Assign values to the variables and execute method display
//
//**Expected Output:**
//
//My name is John and I live in Miami. I study at Syntax in batch 9
public class r137 {
    public String name;
    String city;
    protected String school;
    public int batch;

    void display(){
        System.out.println("My name is "+name+" and I live in "+city+".I study at "+school+" in batch "+batch);
    }

    public static void main(String[] args) {
        r137 f=new r137();
        f.name="John";
        f.city="Miami";
        f.school="Syntax";
        f.batch=9;
        f.display();
    }


}
