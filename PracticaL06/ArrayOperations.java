package PracticaL06;
public class ArrayOperations {
    public static void main(String[] args) {

        // One-Dimensional Array
        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        System.out.println("One-Dimensional Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum = sum + arr[i];  // or sum += arr[i];// sum = 0+10;// sum = 10+20 = 30 

            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        // Average
        double average = (double) sum / arr.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + average);

        // Reverse Array
        System.out.print("Reverse Array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        //Search
        int search = 30;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element " + search + " found in the array.");
        } else {
            System.out.println("Element " + search + " not found in the array.");
        }



        // Multi-Dimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
      
        int total = 0;

        System.out.println("\n\nMulti-Dimensional Array Elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                total = total +  matrix[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum of Matrix Elements = " + total);

        // Transpose of Matrix
        
        System.out.println("\nTranspose of Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}