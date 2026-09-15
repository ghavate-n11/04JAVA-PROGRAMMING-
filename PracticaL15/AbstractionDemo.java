package PracticaL15;


abstract class Vehicle
{
    abstract void start();

    void stop()
    {
        System.out.println("Vehicle Stopped");
    }

}

interface Electric
{
    void charge();
}

interface Smart
{
    void autoPilot();
}


class Car extends Vehicle implements Electric, Smart
{
    @Override 
    void start()
    {
        System.out.println("Car Started");
    }

    @Override 
    void stop()
    {
        System.out.println("Car Stopped");
    }

    @Override 
    public void charge()
    {
        System.out.println("Car Charges");
    }

    @Override
    public void autoPilot()
    {
        System.out.println("Car AutoPilot mode is on");
    }


}


public class   AbstractionDemo
{
    public static void main(String[]aa)
    {
        Car c1 = new Car();

        c1.start();
        c1.stop();
        c1.charge();
        c1.autoPilot();
    }
}