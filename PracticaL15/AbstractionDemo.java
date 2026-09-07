package PracticaL15;

abstract class Vehicle
{
    abstract void start();

    void stop()
    {
        System.out.println("Vehicle stopped");
    }
}

interface ElectricVehicle
{
    void chargeBattery();
}

interface ConnectedVehicle
{
    void connectToApp();
}

class ElectricCar extends Vehicle implements ElectricVehicle, ConnectedVehicle
{
    @Override
    void start()
    {
        System.out.println("Electric car started");
    }

    @Override
    public void chargeBattery()
    {
        System.out.println("Battery charging");
    }

    @Override
    public void connectToApp()
    {
        System.out.println("Car connected to mobile app");
    }
}

public class AbstractionDemo
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new ElectricCar();
        ElectricVehicle electricVehicle = new ElectricCar();
        ConnectedVehicle connectedVehicle = new ElectricCar();

        vehicle.start();
        electricVehicle.chargeBattery();
        connectedVehicle.connectToApp();
        vehicle.stop();
    }
}
