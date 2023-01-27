package class12;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="Iphone";
        iphone.color="Gold";
        iphone.price=1500 ;
        iphone.version=11 ;
        iphone.storage= 256;
        iphone.isUnlocked=true;

        Phone googlePixel=new Phone();
        googlePixel.brand="Pixel";
        googlePixel.color="black";
        googlePixel.price=900 ;
        googlePixel.version=7 ;
        googlePixel.storage=512 ;
        googlePixel.isUnlocked=false;
        googlePixel.sendingMessages();


        Phone s22Ultra=new Phone();
        s22Ultra.brand="Samsung ";
        s22Ultra.color="Silver";
        s22Ultra.price=700 ;
        s22Ultra.version=9;
        s22Ultra.storage=64 ;
        s22Ultra.isUnlocked=false;
        s22Ultra.ringing();

    }

}
