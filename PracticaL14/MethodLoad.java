package PracticaL14;

class Calculator 
{
    void add(int a, int b) //2 parameter
    {
        System.out.println("\nAddition of a & b: " + (a + b));
    }

    void add(int a, int b, int c) //3 parameter
    {
        System.out.println("\nAddition of a , b & c: " + (a + b + c));
    }
}

public class MethodLoad 
{
    static public void main(String[] a) {
        Calculator c1 = new Calculator();
        c1.add(12, 14);
        c1.add(20, 30, 13);
    }
}
