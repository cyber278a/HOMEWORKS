package homework6;
//Please create methods with different access modifiers
// (one for each access modifier) and call them properly in main method one by one
//In each method write the logic accordingly like for private
// method write the logic in the println Statement as "This is Private Method"
// accordingly for rest of the methods that have different access modifiers
// should be a total of 4 outputs, please make sure they are in the same order that is printed below.
public class r136 {
   private void printHello(){
        System.out.println("This is Private Method");}

    void printHello1(){
        System.out.println("This is Default Method");}

   protected void printHello3(){
        System.out.println("This is Protected Method");}

    public void printHello4(){
        System.out.println("This is Public Method");}

    public static void main(String[] args) {
        r136 a=new r136();
        a.printHello();
        a.printHello1();
        a.printHello3();
        a.printHello4();
    }
}
