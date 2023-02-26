package homework6;

 public class Person25 {

   private String firstname;
    private String lastname;
    private int birthmonth;
    private int birthday;
    private int birthyear;
    private String ssn;


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getSsn() {
        return ssn;
    }

    public Person25(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;



    }
    public String formatBirthday(int birthmonth,int birthday,int birthyear){

        return birthmonth+"/"+birthday+"/"+birthyear;
    }
}
class Test25{
    public static void main(String[] args) {
        Person25 p25=new Person25("John","Doe",10,25,1900,"123-45-6789");
        System.out.println(p25.getFirstname());
        System.out.println(p25.getLastname());
        System.out.println(p25.formatBirthday(10,25,1900));
        System.out.println(p25.getSsn());
    }

}