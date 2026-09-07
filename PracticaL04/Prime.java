package PracticaL04;

public class Prime {
    public static void main(String[] args) 
    {

        int num = 12;
        int i = 2;

        if(num == 2) 
        {
            System.out.println(num + " is a prime number.");
            return;
        }

        do {
            if (num % i == 0) 
            {
                System.out.println(num + " is not a prime number.");
                return;
            }
            i++;//increment of iterations
        } while (i < num);//main condition

        System.out.println(num + " is a prime number.");
    }
}