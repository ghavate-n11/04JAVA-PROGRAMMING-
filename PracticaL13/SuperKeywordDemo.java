package PracticaL13;

class Vehicle
{
    int speed = 50;

    Vehicle()
    {
        System.out.println("Vehicle Constructor");
    }

    void display()
    {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle
{
    int speed = 100;

    Car()
    {
        super();    // Calls Vehicle constructor
        System.out.println("Car Constructor");
    }

    void display()
    {
        System.out.println("Car is running");
    }

    void show()
    {
        // Access parent variable
        System.out.println("Vehicle Speed: " + super.speed);

        // Access child variable
        System.out.println("Car Speed: " + this.speed);

        // Call parent method
        super.display();

        // Call child method
        this.display();
    }
}

public class SuperKeywordDemo
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.show();
    }
}