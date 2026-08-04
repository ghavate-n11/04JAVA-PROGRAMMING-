package PracticaL07;
//3x3 Matrix Multiplication.
public class MatrixMultiplication {
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

        // Matrix Multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
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
        System.out.println("\nMultiplication of Two Matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}