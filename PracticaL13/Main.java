
class Animal
{
    String name = "Animal";

    Animal() 
    {
        System.out.println("Parent constructor called");
    }

    void display() 
    {
        System.out.println("Parent method");
    }
}

class Dog extends Animal
{
    String name = "Dog";

    Dog() 
    {
        super();
        System.out.println("Child constructor called");
    }
    
    void show() 
    {
        System.out.println("Child method");
    }

    void display() 
    {
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name);

        this.show();
        super.display();
    }

    
}

public class Main 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.display();
    }
}
