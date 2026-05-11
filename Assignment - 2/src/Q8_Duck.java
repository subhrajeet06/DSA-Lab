interface Flyable
{
    void fly();
}
interface Swimmable
{
    void swim();
}
class Duck implements Flyable, Swimmable
{
    String name;
    Duck (String name)
    {
        this.name = name;
    }
    public void fly()
    {
        System.out.println(name+" can fly");
    }
    public void swim()
    {
        System.out.println(name+" can swim");
    }
    public void display()
    {
        System.out.println("Duck Name: "+name);
        System.out.println("Abilities: Fly and swim");
    }
}
public class Q8_Duck {
    public static void main(String args[])
    {
        Duck d = new Duck("Donald");
        d.fly();
        d.swim();
        d.display();
    }
}
