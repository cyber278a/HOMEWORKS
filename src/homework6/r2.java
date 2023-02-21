package homework6;

public  abstract class r2 {

    int size;



    abstract void open();

    void edit() {

    }

    void close() {
        System.out.println("Closing the file");
    }

}






class BA extends r2{

    @Override
    void open() {

    }
}
class bas extends r2{
    void open() {

    }

}