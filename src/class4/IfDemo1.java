package class4;

public class IfDemo1 {
    public static void main(String[] args) {
        int money = 15000;
        if (money > 1000) {
            System.out.println("Lets  buy Iphone");
        }

        if (money > 2000) {
            System.out.println("Lets also buy MacBook");
        }


        boolean mothersDay = true;
        if (mothersDay) {
            System.out.println("Happy Mothers Day!");
        }
        String name = "Sardar";
        if (name.equals("Sardar")) {// equals method used only for non primitives
            System.out.println("I love football");
        }//if code is a mess we can format it with ctrl-alt-l in windows or cmd-opt-l in Mac
    }
}
