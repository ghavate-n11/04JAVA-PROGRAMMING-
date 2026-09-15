package AccessSpecifires;


public class AccProtected 
{
   public static void main(String[]aa)
   {
    Tiger tg = new Tiger();
    tg.display();
   }

}

class Animal 
{
   protected int id = 12;
}

class  Tiger extends Animal
{
     void display()
     {
      System.out.println(id);
     }
}
