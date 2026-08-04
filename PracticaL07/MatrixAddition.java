package PracticaL07;
// c) Addition of two matrix.
public class MatrixAddition {
    public static void main(String[] args) {

        // First Matrix
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Second Matrix
        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Result Matrix
        int[][] C = new int[3][3];

        // Addition of Matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Display First Matrix
        System.out.println("First Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        // Display Second Matrix
        System.out.println("\nSecond Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }

        // Display Result Matrix
        System.out.println("\nAddition of Two Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}