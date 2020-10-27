public class Probability
{
	public static void main(String[] args)
	{
		int trials = Integer.parseInt(args[0]);

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int count = 0;		

		while(count <= trials)
		{

			int rand = (int)(Math.random() * 4);

			if(rand == 0){
				a++;
			} else if (rand == 1){
				b++;
			} else if (rand == 2){
				c++;
			} else {
				d++;
			}
			count++;
			//System.out.println("A is: " + a + "B is: " + b + "C is: " + a + "D is: " + b);
		}

		double aProb = (((double)a)/trials) * 100;
		double bProb = (((double)b)/trials) * 100;
		double cProb = (((double)c)/trials) * 100;
		double dProb = (((double)d)/trials) * 100;

		System.out.println("Probability of A is " + aProb);

		System.out.println("Probability of B is " + bProb);

		System.out.println("Probability of C is " + cProb);

		System.out.println("Probability of D is " + dProb);
	}
}