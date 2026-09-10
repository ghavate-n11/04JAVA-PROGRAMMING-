package PracticaL07;
//
public class MatrixAddition 
{
    public static void main(String[]aa)
    {
      int matrix1 [][] = {{1,2}, {4,5}};
      int  [][] matrix2 = {{11,12},{14,15}};

      int result[][] = new int [2][2];

      

      for(int i=0; i<2; i++)
      {
        for(int j=0; j<matrix1[i].length; j++)
        {
            result[i][j] = matrix1[i][j] + matrix2[i][j];
            System.out.print(result[i][j]+" ");
        }
        System.out.println();
      }
    }
}
