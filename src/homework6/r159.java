package homework6;
//Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
//
//In main method execute all 3 methods to match the output:
//Expected Output
//
//```
//40 (should come from subtracting 4 numbers)
//30 (should come from subtracting 3 numbers)
//20 (should come from subtracting 2 numbers)
//```
public class r159 {
    void sub(int n1,int n2,int n3,int n4){
        System.out.println((n1-n2-n3-n4)+"(should come from subtracting 4 numbers)");}
    void sub(int n1,int n2,int n3){
        System.out.println(n1-n2-n3);}

   void sub(int n1,int n2){
        System.out.println(n1-n2);}


}
class test4{
    public static void main(String[] args) {
        r159 hello=new r159();
        hello.sub(80,20,10,10);
        hello.sub(60,20,10);
        hello.sub(40,20);
    }
}