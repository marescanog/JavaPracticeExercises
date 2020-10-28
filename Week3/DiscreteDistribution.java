public class DiscreteDistribution
{
 public static void main(String[] args)
 {
  int m = Integer.parseInt(args[0]);
  int[] a = new int[args.length];
  int cSum = 0;

  for (int i = 1; i < args.length; i++)
  {
   a[i] = Integer.parseInt(args[i]);
   cSum += a[i];
   a[i] = cSum;
  }

  for (int i = 0; i < m; i++)
  {
   if (i % 25 == 0 && i != 0) System.out.println();
   int r = (int) (Math.random() * cSum);
   for (int j = 1; j < a.length; j++)
   {
    if (r >= a[j-1] && r < a[j])
    { 
     System.out.print(j + " ");
    }
   }
  }
  System.out.println();
 }
}