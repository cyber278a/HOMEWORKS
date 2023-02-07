package homeworkClass19;

public class Fish {

    String type;
    int quantity;

    void moving() {
        System.out.println("Moving fast");
    }
}
class Seafish extends Fish {
    String size;

    void inhabit() {
        System.out.println("Swim in deep water");
    }
}
class Shark extends Seafish {
    boolean dangerous;

    void jaws() {
        System.out.println("Can tear you apart");
    }

    public static void main(String[] args) {
        Shark sh=new Shark();
        sh.moving();
    }
}