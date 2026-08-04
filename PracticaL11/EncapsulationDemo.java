package PracticaL11;
//Write a Java program to demonstrate encapsulation using access specifiers.
// Java program to demonstrate encapsulation
class Student
{
    // Private data members
    private String name;
    private int age;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        // Creating object
        Student s = new Student();

        // Setting values using setter methods
        s.setName("Rahul");
        s.setAge(20);

        // Getting values using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
