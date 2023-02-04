package homeworklClass17;

public class Book {
    //6) Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed
    String name;
    String cover;
    int pages;
    char rating;
    double number;

    Book(String BookName,String BookCover,int NumberOfPages){
        name=BookName;
        pages=NumberOfPages;
        cover=BookCover;}

    Book(char Rating,double BoookNumber){
        number=BoookNumber;
        rating=Rating;}
void printInfo(){
    System.out.println(name+" "+" "+pages+" "+cover);}
 void printInfo1() {
        System.out.println(number+" "+rating);
}
    public static void main(String[] args) {
        Book b1=new Book("Empire","hard",345);
        Book b2=new Book('A',677899);
        b1.printInfo();
        b2.printInfo1();
    }
    }






