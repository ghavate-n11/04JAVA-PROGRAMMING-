package PracticaL09;
import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not: ");
        String str = sc.nextLine();
        String rev = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            rev = rev + str.charAt(i);                                              

        }               

        if(str.equals(rev))
        {
            System.out.println("The string is palindrome");
        }
        else
        {
            System.out.println("The string is not palindrome");
        }
    }
}