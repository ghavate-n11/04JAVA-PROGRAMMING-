package PracticaL12;

// Base Class (Superclass)
class Grandfather 
{
    void showGrandfather() 
    {
        System.out.println("I am the Grandfather.");
    }
}

// Parent Class (Part of Multilevel: Grandfather -> Father)
class Father extends Grandfather 
{
    void showFather() 
    {
        System.out.println("I am the Father.");
    }
}

// Child Class 1: MULTILEVEL INHERITANCE (Grandfather -> Father -> Son)
class Son extends Father 
{
    void showSon() 
    {
        System.out.println("I am the Son.");
    }
}

// Child Class 2: SINGLE INHERITANCE (Grandfather -> Daughter)
class Daughter extends Grandfather 
{
    void showDaughter() 
    {
        System.out.println("I am the Daughter.");
    }
}

public class HybridInheritanceDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("=== HYBRID INHERITANCE (Multilevel + Single) ===");
        
        System.out.println("\n--- [Multilevel Inheritance] Grandfather -> Father -> Son ---");
        Son son = new Son();
        son.showGrandfather(); // Inherited from Grandfather
        son.showFather();       // Inherited from Father
        son.showSon();          // Own method
        
        System.out.println("\n--- [Single Inheritance] Grandfather -> Daughter ---");
        Daughter daughter = new Daughter();
        daughter.showGrandfather(); // Inherited from Grandfather
        daughter.showDaughter();    // Own method
    }
}


