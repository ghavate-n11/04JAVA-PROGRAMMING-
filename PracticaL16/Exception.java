package PracticaL16;

public class Exception 
{
    public static void main(String[] args) 
    {
        // 1. ArithmeticException//
        try 
        {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("1. ArithmeticException caught: Cannot divide by zero.");
        }

        // 2. NullPointerException
        try 
        {
            String text = null;
            System.out.println("Length: " + text.length()); // Calling method on null object
        } 
        catch (NullPointerException e) 
        {
            System.out.println("2. NullPointerException caught: String reference is null.");
        }

        // 3. ArrayIndexOutOfBoundsException
        try 
        {
            int[] numbers = {10, 20, 30};
            System.out.println("Element: " + numbers[5]); // Index 5 does not exist
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("3. ArrayIndexOutOfBoundsException caught: Index is out of range.");
        } 
        finally 
        {
            System.out.println("Finally block is executed: Cleanup / Always runs.");
        }

        System.out.println("Program continues smoothly after handling all exceptions.");
    }
}
