package PracticaL01;

public class Practical1 
{
    public static void main(String[] aa)

    {
        //Part1: Display Hello World
        System.out.println("----Hello World Program----");
        System.out.println("\n Hello World");

        //Part2: Demonstration  of Java Program Structure
        System.out.println("\n----Java Program Structure----");

        //Part3. Demonstration of variables, data types & type casting
        
        int a = 10;
        byte b = 20;
        short c = 5;
        long d  = 10000L;
        double e = 10.0d;
        float f = 10.0f;
        boolean g = true;
        char h = 'N';

        System.out.println("\n----Demonstration of variables, data types & Typecasting----");
        System.out.println("Integer value of a: "+a);
        System.out.println("Byte value of b: "+b);
        System.out.println("Short value of c: "+c);
        System.out.println("Long value for d: "+d);
        System.out.println("Double balue for e: "+e);
        System.out.println("Float value for f: "+f);
        System.out.println("Boolean value for g: "+g);
        System.out.println("Char value for h: "+h);

        //Part4. Typecasting
        //Implicit Typecasting or Widening 

        System.out.println("\n----Typecasting----");
        int w = 10;
        double y = w;

        System.out.println("Implicit Typecasting: value of y: "+y);

        //Explicit Typecasting or Narrowing

        double q = 100.0d;
        float p = (float) q;
        
        System.out.println("Explicit Typecasting: value of p: "+p);


    }
}
