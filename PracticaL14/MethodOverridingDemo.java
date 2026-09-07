package PracticaL14;

class MethodOverridingDemo
{
    public static void main(String[]args)
    {
        M1override MO = new MethodOverriding();
        MO.display();
    }
}

class M1override
{
      void display()
      {
        System.out.println("Parent method ");
      }
}
class MethodOverriding extends M1override
{
    @Override 
    void display()
    {
        System.out.println("Child method ");
    }
    
}
