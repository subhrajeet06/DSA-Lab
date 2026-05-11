abstract class Shape {
    abstract void area();
}
class Square extends Shape
{
    double side;
    Square(double side)
    {
        this.side = side;
    }
    void area()
    {
        System.out.println("Area of the square is: "+(side*side));
    }
}

class Triangle extends Shape
{
    double base, height;
    Triangle(double base, double height)
    {
        this.base = base;
        this.height = height;
    }
    void area()
    {
        System.out.println("Area of the triangle is: "+(0.5*base*height));
    }
}

class Circle extends Shape
{
    double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    void area()
    {
        System.out.println("Area of the circle is: "+(Math.PI*radius*radius));
    }
}

public class Q5_Shape
{
    public static void main(String args[])
    {
        Shape s = new Square(5);
        Shape t = new Triangle(5,3);
        Shape c = new Circle(8);
        s.area();
        t.area();
        c.area();
    }
}