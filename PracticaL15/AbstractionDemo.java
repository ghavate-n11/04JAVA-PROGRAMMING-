package PracticaL15;

abstract class Vehicle//abstract class it is partially implemented class 
{
    abstract void start();//abstract method it is not implemented method
//
    void stop()
    {
        System.out.println("Vehicle stopped");
    }
}

interface ElectricVehicle//interface it is not fully implemented class it is fully abstract class
{
    void chargeBattery();
}

interface ConnectedVehicle
{
    void connectToApp();
}

class ElectricCar extends Vehicle implements ElectricVehicle, ConnectedVehicle
{
    @Override//it is used to override the method of parent class
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
