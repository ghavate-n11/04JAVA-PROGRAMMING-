package PracticaL12;

class College 
{
    void display() 
    {
        System.out.println("I am a College");
    }
}

class Chairperson extends College 
{
    void function() 
    {
        System.out.println("I am Higher Authority");
    }
}

class HOD extends Chairperson 
{
    void schedule() 
    {
        System.out.println("I am Scheduling meeting for Trainers");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] aa) {
        HOD main = new HOD();

        System.out.println("\n=== TODAY'S SCHEDULE ===\n");

        main.display();
        main.function();
        main.schedule();
    }
}