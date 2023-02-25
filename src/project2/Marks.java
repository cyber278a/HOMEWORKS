package project2;
//We have to calculate the average of marks
//obtained in three subjects by student A and by
//student B. Create class 'Marks' with an abstract
//method 'getPercentage' that will be returning
//the average percentage of marks. Provide
//implementation of abstract method in classes
//'A' and 'B'. The constructor of student A takes the
//marks in three subjects as its parameters and
//the marks in four subjects as its parameters for
//student B. Test your code
public abstract class Marks {




    abstract double getPercentage();
}
class A extends Marks{
    double marksSubject1;
    double marksSubject2;
    double marksSubject3;
    

    public A(double marksSubject1, double marksSubject2, double marksSubject3) {
        this.marksSubject1 = marksSubject1;
        this.marksSubject2 = marksSubject2;
        this.marksSubject3 = marksSubject3;

    }

    @Override
    double  getPercentage() {return (marksSubject1+marksSubject2+marksSubject3)/3;

    }
}
class B extends Marks{
    double marksSubject1;
    double marksSubject2;
    double marksSubject3;
    double marksSubject4;

    public B(double marksSubject1, double marksSubject2, double marksSubject3, double marksSubject4) {
        this.marksSubject1 = marksSubject1;
        this.marksSubject2 = marksSubject2;
        this.marksSubject3 = marksSubject3;
        this.marksSubject4 = marksSubject4;
    }

    @Override
    double getPercentage() {
        return (marksSubject1+marksSubject2+marksSubject3+marksSubject4)/4;
    }
}
class Test2{
    public static void main(String[] args) {
        A a=new A(87,98,80);
        System.out.println(a.getPercentage());
        B b=new B(89,90,87,94);
        System.out.println(b.getPercentage());
    }
}