package homeworkClass22;
////Create a class CreditCard and define variable balance and interest.
//    // Create an instance method that will calculate interest based on the given balance.
//    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//    //Call the method by creating an object of each of the three classes.
public class CreditCard {
    double balance ;
    double interest;
    double yourInterest(int balance){interest=balance*0.1;
    this.balance=balance;return interest;}
}
class Visa extends CreditCard{}

    class AX extends  CreditCard {
    @Override
        double yourInterest(int balance) {
            interest = balance * 0.12;
            this.balance = balance;
            return interest;}


        public static void main(String[] args) {
            CreditCard cc = new CreditCard();
            System.out.println(cc.yourInterest(10000));
            Visa visa = new Visa();
            System.out.println(visa.yourInterest(10000));
            AX ax = new AX();
            System.out.println(ax.yourInterest(10000));

        }
    }