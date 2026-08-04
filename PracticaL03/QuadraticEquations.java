package PracticaL03;


public class QuadraticEquations 
{
    public static void main(String[] args) 
    {
       double a = 10;
       double b = 23;
       double c = -1;

       double d = b*b - 4*a*c;

       if(d > 0)
       {
        double root1 = (-b*b + Math.sqrt(d)/2*a);
        double root2 = (-b*b - Math.sqrt(d)/2*a);

        System.out.println("Two real & Distinct roots: ");
        System.out.println("Root1: "+root1);
        System.out.println("Root2: "+root2);

       }
       else if(d == 0)
       {
        double root = -b /(2.0*a);

        System.out.println("Two real & Equal roots: ");
        System.out.println("Root:"+root);

       }
       else
       {
        System.out.println("Roots are complex & Imaginary");
       }
    }
}
