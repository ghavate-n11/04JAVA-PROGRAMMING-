package PracticaL13;

// Demonstration of 'this' keyword
class StudentRecord 
{
    int rollNo;
    String name;
    String course;

    // 1. Using this() for Constructor Chaining
    StudentRecord() 
    {
        this(0, "Not Assigned", "General");
        System.out.println("Default constructor called.");
    }

    // 2. Using 'this' to distinguish instance variables from local parameters
    StudentRecord(int rollNo, String name, String course) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }


    void printHeader() 
    {
        System.out.println("\n--- Student Details ---");
    }
    
    // 3. Using this to invoke current class method
    void display() 
    {
        this.printHeader();
        System.out.println("Roll No: " + this.rollNo);
        System.out.println("Name   : " + this.name);
        System.out.println("Course : " + this.course);
    }

    
}

public class ThisKeywordDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("=== DEMO OF 'this' KEYWORD ===");
        StudentRecord s1 = new StudentRecord(101, "Rahul", "Computer Science");
        s1.display();

        StudentRecord s2 = new StudentRecord();
        s2.display();
    }
}
