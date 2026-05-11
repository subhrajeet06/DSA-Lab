class Vehicle
{
    String model;
    int year;
    Vehicle(String model, int year)
    {
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle
{
    int car_id;
    double price;
    Car(String model, int year, int car_id, double price)
    {
        super(model, year);
        this.car_id = car_id;
        this.price = price;
    }
    void carDisplay()
    {
        System.out.println("Car ID: "+car_id+"\tModel: "+model+"\tYear: "+year+"\tPrice: "+price);
    }
}
public class Q6_Vehicle
{
    public static void main(String args[])
    {
        Car c1 = new Car("TOYOTA", 2020, 101, 1000000);
        Car c2 = new Car("HONDA", 2021, 102, 1200000);
        c1.carDisplay();
        c2.carDisplay();
    }
}