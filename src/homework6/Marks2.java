package homework6;

abstract public class Marks2 {
    abstract double getPercentage();

}
class A15 extends Marks2{
    double [] arr;

    public A15(double[] arr) {
        this.arr = arr;

    }

    @Override
    double getPercentage() {double sum=0;
        for (double mark:arr){sum+=mark;}
        double average=sum/arr.length;
        return average;
    }
}
class Test3{
    public static void main(String[] args) {
    double[]bb={88,88,88};
       A15 a1=new A15(bb);
        System.out.println(a1.getPercentage());

    }
}
