public class Minesweeper
{
 public static void main(String[] args)
 {
  int m = Integer.parseInt(args[0]);
  int n = Integer.parseInt(args[1]);
  int k = Integer.parseInt(args[2]);

  boolean[][] mines = new boolean[m+2][n+2];

if (k >= m*n)
{
   for (int i = 1; i < m+1; i++)
  {
   for (int j = 1; j < n+1; j++)
   {
    mines[i][j] = true;
   }
  }
}
else {
 while (k != 0)
 {
  int randX = ((int) (Math.random() * m)) + 1; 
  int randY = ((int) (Math.random() * n)) + 1;
  if (!mines[randX][randY])
  {
   mines[randX][randY] = true;
   k--;
  } 
 }
}

  int[][] numCount = new int[m][n];
  for (int i = 0; i < m; i++)
  {
   for (int j = 0; j < n; j++)
   {
     for (int p = 0; p < 3; p++)
     {
       for (int q = 0; q < 3; q++)
       {
        if (!(p == 1 && q == 1))
        {
         if (mines[i+p][j+q]) numCount[i][j]++;
        }
       }
     }
   }
  }

  for (int i = 0; i < m; i++)
  {
   for (int j = 0; j < n; j++)
   {
    if (mines[i+1][j+1]) System.out.print("*  ");
    else System.out.print(numCount[i][j] + "  ");
   }
    System.out.println();
  }
 }
}