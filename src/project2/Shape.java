package project2;
//1. Create an Interface 'Shape' with undefined
//methods as calculateArea and
//calculatePerimiter. Create 2 classes Circle &
//Square that implements functionality defined in the Shape Interface. Test your code

public interface Shape {
    double calculateArea();

    double calculatePerimeter();
}
class Circle implements  Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {double cArea=radius*radius*Math.PI;
        return cArea;
    }

    @Override
    public double calculatePerimeter() {double cPerimeter=2*radius*Math.PI;
        return cPerimeter;
    }
}
class Square implements Shape{
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {double sArea=side*side;
        return sArea;
    }

    @Override
    public double calculatePerimeter() {double sPerimeter=4*side;
        return sPerimeter;
    }
}
class Test{
    public static void main(String[] args) {
        Circle circle=new Circle(3
        );
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
        Square square=new Square(3);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }

}






