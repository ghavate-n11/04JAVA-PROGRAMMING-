package PracticaL13;

class Parent
{
    int number = 10;

    Parent()
    {
        System.out.println("Parent Constructor");
    }

    void display()
    {
        System.out.println("Parent display method");
    }
}

class Child extends Parent
{
    int number = 20;

    Child()
    {
        super();       // calls Parent constructor
        System.out.println("Child Constructor");
    }

    void show()
    {
        System.out.println("Parent number: " + super.number);
        System.out.println("Child number: " + this.number);

        super.display();   // calls Parent method
        this.displayChild(); // calls Child method
    }

    void displayChild()
    {
        System.out.println("Child method");
    }
}

public class ThisSuperDemo
{
    public static void main(String[] args)
    {
        Child c = new Child();
        c.show();
    }
}