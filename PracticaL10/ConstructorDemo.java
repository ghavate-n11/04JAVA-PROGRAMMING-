package PracticaL10;
//Write a Java program to create a class and object and demonstrate constructors.

class Student
{
    String name = "Nilesh";
    int age = 19;

    Student()//Default Constructor
    {
        name = "ParulUniversity";
        age = 22;
    }

    Student(String n, int a)//Parameterized Constructor
    {
        name = n;
        age = a;
    } 


    void display()
    {
        System.out.println("\nName: " + name);
        System.out.println("\nAge: "+ age);
    }
}

class ConstructorDemo
{
    public static void main(String[]aa)
    {
        Student s1 = new Student();
        System.out.println("\n****Default Constructor****");
        s1.display();

        Student s2 = new Student("Patel",24);
        System.out.println("\n****Parameterized Constructor****");
        s2.display();
    }
}