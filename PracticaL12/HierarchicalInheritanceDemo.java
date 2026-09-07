package PracticaL12;

class Animal
{
  void display()
  {
    System.out.println("Parent Method");
  }
}

class Tiger extends Animal
{
  void show()
  {
    System.out.println("First Child method");
  }
}

class Lion extends Animal
{
  void wakeup()
  {
    System.out.println("Second Child Method");
  }
}

public class HierarchicalInheritanceDemo
{
  public static void main(String [] aa)
  {
     System.out.println("===Hierarchical Inheritance Demo") ;

     Lion l = new Lion();
     l.display();
     l.wakeup();
     //l.show();

  }
}