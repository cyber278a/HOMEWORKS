package homework6;
//Overload instance method display by having different types of parameters
//
//Inside each method write the logic to print value of the parameter
//
//Call all methods inside your main method
//
//**Expected Output:**
//
//```
//100
//```
//
//```
//Syntax Technologies
//```
//
//```
//100.09
//```
public class r160 {
    void display(int a){
        System.out.println(a);
}
    void display(String b){
        System.out.println(b);
    }
    void display(double d){
        System.out.println(d);
    }
    public static void main(String[] args) {

r160 displa=new r160();
displa.display(100);
displa.display("Syntax Technologies");
displa.display(100.09);




}}
