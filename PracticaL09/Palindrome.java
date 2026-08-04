package PracticaL09;

// Simple interview-friendly two-pointer palindrome check.
class Palindrome
{
    public static void main(String[] ma)
    {
        String s = "RADAR";

        int left = 0;
        int right = s.length()-1;

        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                System.out.println("String is not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("String is a palindrome");
    }
}