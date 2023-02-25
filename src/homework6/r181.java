package homework6;
//Create Class Account
//
//Create the below variables:
//
//- acc_no;
//- name;
//- email;
//- double amount;
//
//Create the getter/setter methods for each variable.
//
//In Main Class and the main method.
//
//Using setter methods assign the values as:
//
//acc_no = 7560504000
//
//name = Sumair
//
//email = sumair@syntax.com
//
//amount = 50000.0
//
//Using getter methods print the values as below output.
//7560504000 Sumair sumair@syntax.com 50000.0
public class r181 {
}
class Account{
    private String acc_no;
private String name;
private String email;
private double amount;

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    }

class Main11{
    public static void main(String[] args) {


      Account m10=new Account() ;
    m10.setAcc_no("7560504000");
    m10.setName("Sumair");
    m10.setEmail("sumair@syntax.com");
    m10.setAmount(50000);
        System.out.println(m10.getAcc_no()+" "+m10.getName()+" "+m10.getEmail()+" "+m10.getAmount());

    }
}