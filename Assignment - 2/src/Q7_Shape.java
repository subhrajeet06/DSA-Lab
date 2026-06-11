class Shape
{
    String color;
    Shape(String color)
    {
        this.color = color;
    }
}

class Circle extends Shape
{
    double radius, area;
    Circle(String color, double radius)
    {
        super(color);
        this.radius = radius;
    }
    double area()
    {
        return Math.PI * radius * radius;
    }
    void display()
    {
        System.out.println("Circle Color: "+color+"\tRadius: "+radius+"\tArea: "+area());
    }
}

class Rectangle extends Shape
{
    double length, width, area;
    Rectangle(String color, double length, double width)
    {
        super(color);
        this.length = length;
        this.width = width;
    }
    double area()
    {
        return length * width;
    }
    void display()
    {
        System.out.println("Rectangle Color: "+color+"\tLength: "+length+"\tWidth: "+width+"\tArea: "+area());
    }
}
public class Q7_Shape {
    public static void main(String args[])
    {
        Circle c = new Circle("Red", 5.0);
        Rectangle r = new Rectangle("Blue", 4, 6);
        c.display();
        r.display();
    }
}
