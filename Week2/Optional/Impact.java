/*
1.3.28 Run quick experiments to determine the impact of using the termination condition (factor <= n/factor) instead of (factor < n) in Factors in Program 1.3.9. For each method, find the largest n such that when you type in an n-digit number, the program is sure to finish within 10 seconds.

Answer: 
if i is declared as int

Largest Possible N is:11111111111111173 for (factor < n)

While for (factor <= n/factor)
111111111111113690 is the highest N I have tested, but starting to copmute at an 
average of 3-4 seconds. 


*/

public class Impact
{
	public static void main(String[] args)
	{
		boolean isTimedOut = false;
		long x = 111111111111113341L;

		while (isTimedOut == false)
		{
		
		long n = x;
		System.out.print("N is: " + x + " Factors are: ");
		long start = System.currentTimeMillis();
		long end = start + 10*1000; 

		while (System.currentTimeMillis() < end)
		{
			
			for (int i = 2; i <= n/i ; i++)
			{
				if(System.currentTimeMillis()>end) 
				{
					isTimedOut = true;
					break;
				}
				while(n%i==0)
				{
					System.out.print(i + " ");
					n = n/i;
				}
			}


		long endTime = System.currentTimeMillis() - start;

			if (n>1) 
			{
				System.out.println(n + "\n Total time: " + endTime);
				break;
			}
			else 
			{
				System.out.println("\n Total time: " + endTime);
				break;
			}
		}

		x ++;
		}


		System.out.println("Largest Possible N is:" + x);
		System.out.println("Timed Out: " + isTimedOut);

	}
}