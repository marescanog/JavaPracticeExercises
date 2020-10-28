public class Birthday
{
 public static void main(String[] args)
 {
  int n = Integer.parseInt(args[0]);
  int trials = Integer.parseInt(args[1]);
  int[] peopleArr = new int[1000000];
  int count = 0;
  int cumuSum = 0;

  while (count <= trials)
  {
   int r = 0;
   int people = 0;
   boolean[] birthdays = new boolean[n];
   boolean isBdayShare = false;

   while (!isBdayShare)
   {
    r = (int) (Math.random() * n);
    if (birthdays[r]) isBdayShare = true;
    else birthdays[r] = true;
    people ++ ;
   }

   peopleArr[people] += 1;
   count++;
  }
  
  for (int i = 1; i < peopleArr.length; i++)
  {
   cumuSum += peopleArr[i];
   double fraction = (double) cumuSum / trials;
   System.out.println(i + "\t" + peopleArr[i] + "\t" + fraction);

   if (fraction > 0.50) break;
  }

 }
}