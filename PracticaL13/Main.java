package PracticaL13;
public class Main
{
  public static void main(String []aa)
  {
    Lion king = new Lion();
    king.display();
  }
}



class Animal
{
    Animal()
    {
        System.out.println("Parent class Constructor is called");
    }

    void sound()
    {
        System.out.println("Parent class method is called");
    }

    String name = "Monk";
}


class Lion extends Animal
{
    Lion()
    {
        super();

        System.out.println("Child class constructor is called");
    }

    void noise()
    {
        System.out.println("Child class method is called");
    }

    String name = "King";


    void display()
    {
        System.out.println("Parent class variable achieved via super keyword: "+super.name);
        System.out.println("Child class variable achived via this keyword: "+this.name);
    

    super.sound();
    this.noise();
    }
}

//