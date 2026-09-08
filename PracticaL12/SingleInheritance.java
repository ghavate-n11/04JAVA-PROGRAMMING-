package PracticaL12;

class Human 
{
    void display() 
    {
        System.out.println("We all are the Humans");
    }
}

class Man extends Human 
{
    void display() 
    {
        
        System.out.println("I am part of Human");
    }
}

public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Man m = new Man();

        m.display();
        m.display();
    }
}
