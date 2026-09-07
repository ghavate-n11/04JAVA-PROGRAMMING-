package PracticaL13;

// =======================================================
// Program: Demonstrate the use of 'this' and 'super' in Java
// =======================================================

// Parent Class
class Parent 
{
    String message = "Variable inside Parent Class";

    // Parent Constructor
    Parent() 
    {
        System.out.println("1. [super()] Parent Default Constructor called.");
    }

    // Parent Parameterized Constructor
    Parent(String msg) 
    {
        System.out.println("1. [super(msg)] Parent Constructor called: " + msg);
    }

    // Parent Method
    void display() 
    {
        System.out.println("2. [super.method()] display() method inside Parent Class.");
    }
}

// Child Class extending Parent
class Child extends Parent 
{
    String message = "Variable inside Child Class";

    // Child Default Constructor
    Child() 
    {
        // 1. Using super() to invoke parent constructor
        super("Hello from Child"); 
        System.out.println("3. Child Default Constructor called.");
    }

    // Child Parameterized Constructor (Constructor Chaining using this())
    Child(int number) 
    {
        // 2. Using this() to invoke another constructor of the same class
        this(); 
        System.out.println("4. [this()] Child Parameterized Constructor called with number: " + number);
    }

    // Child Method
    void show() 
    {
        // 3. Using super.variable to access parent's hidden variable
        System.out.println("\nParent message (super.message): " + super.message);

        // 4. Using this.variable to access current class variable
        System.out.println("Child message  (this.message) : " + this.message);

        // 5. Using super.method() to call parent's overridden method
        System.out.println();
        super.display();

        // 6. Using this.method() to call current class method
        this.childSpecificMethod();
    }

    void childSpecificMethod() 
    {
        System.out.println("5. [this.method()] childSpecificMethod() executed.");
    }
}

public class ThisSuperDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("==============================================");
        System.out.println("   DEMONSTRATION OF 'this' AND 'super'        ");
        System.out.println("==============================================");

        // Creating child object using parameterized constructor
        Child obj = new Child(100);

        System.out.println("\n--- Calling obj.show() ---");
        obj.show();
    }
}
