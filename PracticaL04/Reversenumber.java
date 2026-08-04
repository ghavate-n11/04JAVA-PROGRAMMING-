package PracticaL04;
// Write a Java program to demonstrate looping constructs: a) Reverse of a number using while loop. 
import java.util.Scanner;
public class Reversenumber 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = sc.nextInt();
      
      int reversed = 0;

      while(num > 0)
      {
        int digit = num %10;
        reversed = reversed * 10 + digit;
        num = num/10;

      }

      System.out.println(reversed);
    }
    
}
