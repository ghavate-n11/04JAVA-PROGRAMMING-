
class Calculator
{
    void add(int a, int b)
    {
        System.out.println("\n First add() method with 2 parameters only: "+a+b);
    }

    void add(int a, int b, int c)
    {
        System.out.println("\n Second add() method with 3 parameters only: "+a+b+c);
    }
}

public class MethodLoad
{
   public static void main(String[]aa)
   {
      Calculator c = new Calculator();
    c.add(1,2);
    c.add(2,3,1);
   }
}
