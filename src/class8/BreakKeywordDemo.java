package class8;

public class BreakKeywordDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            if(i==3){
                break;// break works only for "SWITCH" and for"loops"!!!!!!!!!!!!!!!!!!!!!!!!!
            }
            System.out.println(i);
        }

        System.out.println("Last line in our code");
    }
}
