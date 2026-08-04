package PracticaL04;

public class Fibonacci
{
    public static void main(String[]args)
    {
        int num = 5;

        int first = 0;
        int second = 1;
    

        for(int i = 1; i <= num ; i++)
        {
            int next = first + second;
            first = second;
            second = next;

            System.out.println(next);
        }

    }
}

