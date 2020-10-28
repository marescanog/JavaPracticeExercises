/*
1.4.18 Write a code fragment to multiply two rectangular matrices that are not necessarily square. Note: For the dot product to be well defined, the number of columns in the first matrix must be equal to the number of rows in the second matrix. Print an error message if the dimensions do not satisfy this condition.
*/

public class RecMatrix
{
 public static void main(String[] args)
 {
  int row1 = Integer.parseInt(args[0]);
  int col1 = Integer.parseInt(args[1]);
  int row2 = Integer.parseInt(args[2]);
  int col2 = Integer.parseInt(args[3]);

  int[][] mat1 = new int[row1][col1];
  int[][] mat2 = new int[row2][col2];

  System.out.println("Matrix1 row: " + row1 + " column: " + col1); 
  System.out.println("Matrix2 row: " + row2 + " column: " + col2); 

if(col1==row2)
{
  System.out.println();
  System.out.println("MATRIX A");
  for(int i=0; i<row1; i++)
  {
   for(int j=0; j<col1; j++)
   {
    mat1[i][j] = (int) (Math.random() * 10);
    System.out.print(mat1[i][j] + " ");
   }
   System.out.println();
  }

  System.out.println();
  System.out.println("MATRIX B");
  for(int i=0; i<row2; i++)
  {
   for(int j=0; j<col2; j++)
   {
    mat2[i][j] = (int) (Math.random() * 10);
    System.out.print(mat2[i][j] + " ");
   }
   System.out.println();
  }

  int[][] mat3 = new int[row1][col2];
  System.out.println();
  System.out.println("MATRIX A * MATRIX B");
  for(int i=0; i<row1; i++)
  {
   for(int j=0; j<col2; j++)
   {
     for(int k=0; k<row2; k++)
     {
      mat3[i][j] += mat1[i][k]*mat2[k][j];
     }

    System.out.print(mat3[i][j] + " ");
   }
   System.out.println();
  }

}
else
{
 System.out.println("\n the number of columns in the first matrix must be equal to the number of rows in the second matrix");
}



 }
}