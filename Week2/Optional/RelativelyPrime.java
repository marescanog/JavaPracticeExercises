/*
1.3.31 Write a program RelativelyPrime that takes an integer command-line argument n and prints an n-by-n table such that there is an * in row i and column j if the gcd of i and j is 1 (i and j are relatively prime) and a space in that position otherwise.
*/

public class RelativelyPrime
{

private static int gcd(int a, int b) {
    int t;
    while(b != 0){
        t = a;
        a = b;
        b = t%b;
    }
    return a;
}

	public static void main(String[] args)
	{
		int n = Integer.parseInt(args[0]);
		
		for (int i=0; i<n; i++)
		{
			for (int j=0; j<n; j++)
			{
			  if (gcd(i,j) == 1) System.out.print("* ");
			  else System.out.print("  ");
			}
			System.out.println();

		}		
	}

}