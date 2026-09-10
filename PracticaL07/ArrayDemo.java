package PracticaL07;
//
public class ArrayDemo 
{
    public static void main(String[] args) 
    {

      
        int[] arr = {12, 45, 78, 45, 90, 67, 90, 34};

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] > max) 
                {
                secondMax = max;
                max = arr[i];
                } 
                else if (arr[i] > secondMax && arr[i] != max) 
                {
                secondMax = arr[i];
                }
        }

        
        System.out.println("\nMaximum Value = " + max);
        System.out.println("Second Maximum Value = " + secondMax);
    }
}