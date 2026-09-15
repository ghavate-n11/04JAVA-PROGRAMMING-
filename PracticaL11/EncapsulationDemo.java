package PracticaL11;

public class EncapsulationDemo
{//
    public static void main(String[]aa)
    {
        Student s1 = new Student();
        
        System.out.println("\n==**EncapsulationDemo**==\n");


        s1.setName("OM NAMAH SHIVAY");
        s1.setRollNo(31);

        System.out.println("Sudent Name: "+s1.getName());
        System.out.println("Student Roll No: "+s1.getRollNo());
    }
}

class Student
{
    private String Name;
    private int RollNo;


    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setRollNo(int RollNo)
    {
        this.RollNo = RollNo;
    }

    public String getName()
    {
        return Name;
    }

    public int getRollNo()
    {
        return RollNo;
    }

}

