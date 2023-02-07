package homeworkClass20;

public class Shape {
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class CircleArea extends Shape{

CircleArea(double radius)
{super(radius);}
    void area(){
    System.out.println("The area of circle is "+radius*radius*Math.PI);}

    public static void main(String[] args) {
        CircleArea ca=new CircleArea(5);
        ca.area();
    }


}