package PracticaL17;

public class Exception {
    public static void main(String[] args) {
//
        try {
            // Code that may cause an exception
            int a = 10;
            int b = 110;
            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handles the exception
            System.out.println("Exception caught: Cannot divide by zero.");
        } finally {
            // Always executes
            System.out.println("Finally block is executed.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
