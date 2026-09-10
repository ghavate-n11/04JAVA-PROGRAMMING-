package PracticaL12;

// Interface 1
interface Printable 
{
    void print();
}

// Interface 2
interface Showable 
{
    void show();
}

// Class implementing multiple interfaces
class Document implements Printable, Showable 
{
    public void print() 
    {
        System.out.println("Printing document...");
    }
//
    public void show() 
    {
        System.out.println("Showing document preview...");
    }
}

public class MultipleInheritanceDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("=== MULTIPLE INHERITANCE (Via Interfaces) ===");
        Document doc = new Document();
        
        doc.print(); // From Printable interface
        doc.show();  // From Showable interface
    }
}
