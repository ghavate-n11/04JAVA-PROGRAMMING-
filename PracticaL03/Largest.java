package PracticaL03;
//c) //Largest of three numbers using nested if else statement.
public class Largest 
{
    public static void main(String[] args) 
    {
       int a = 25,  b = 23, c = 24;

       if(a>b)
       {
        if(a>c)
        {
            System.out.println("a is greater than c");
        }
        else
        {
            System.out.println("a is greater than b");
        }
       }
       else
       {
        if(b>c)
        {
            System.out.println("b is greater than c");
        }
        else
        {
           System.out.println("b is less than c");
        }

       }
    }
}
