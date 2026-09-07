package PracticaL04;
//nth term of fibbonacci sequence i want only the nth term of fibbonacci sequence

public class Fibonacci {
    public static void main(String[] args) {
        int  n =9; 
        int first = 0, second = 1;
        int  nthTerm = 0;

            if (n == 1) 
            {
            nthTerm = first;
            } 
            else if (n == 2) 
            {
            nthTerm = second;
            } 
            else 
                {
            
            for (int i = 3; i <= n; i++) {
                nthTerm = first + second;
                first = second;
                second = nthTerm;
            }
               }

        System.out.println("The " + n + "th Fibonacci term is: " + nthTerm);
    }
}