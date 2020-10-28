public class ThueMorse
{
 public static void main(String[] args)
 {
  int n = Integer.parseInt(args[0]);
  boolean[] a = new boolean[n*n];
 
  int exp = 0;
  int count = 1;

  while (count < a.length)
  {
   boolean[] b = new boolean[((int) Math.pow(2,exp))];
   
   for (int j = 0; j < b.length && j < a.length; j++)
   {
    b[j] = !(a[j]);
   }

   for (int i = 0; i < b.length && count < a.length; i++, count++)
   {
    a[count] = b[i];
   }

   exp++;
  }

  for (int i = 0; i < n; i++)
  {
    for (int j = 0; j < n; j++)
    {
      if (a[i * n + j]) System.out.print("-");
      else System.out.print("+");
      System.out.print("  ");
    }
   System.out.println();
  }
  System.out.println();
 }
}