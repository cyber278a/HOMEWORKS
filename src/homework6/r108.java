package homework6;
//1Create method name it as newLine
//2. Add print statement inside method body as "newLine method implementation
//3. Call newLine method three times
public class r108 {
    void newLine(int times) {

        for (int i = 0; i < times; i++) {
            System.out.println("newLine method implementation");
        }
    }
    public static void main(String[] args) {
        r108 rd=new r108();
        rd.newLine(3);
    }

}