public class RandomWalkers
{
	public static void main(String[] args)
	{
		int r = Integer.parseInt(args[0]);
		int trials = Integer.parseInt(args[1]);
		int x = 0;
		int y = 0;
		int distance = 0;
		int steps = 0;
		int count = 0;
		double aveSteps = 0;

		while(count<=trials)
		{
			distance = Math.abs(x) + Math.abs(y);
			while (distance != r)
			{
				int rand = (int)(Math.random() * 4);
			
				if(rand == 0){
					x++;
				} else if (rand == 1){
					x--;
				} else if (rand == 2){
					y++;
				} else {
					y--;
				}

				steps ++;
				distance = Math.abs(x) + Math.abs(y);
			}
			
			
			aveSteps +=(double)steps;
			count++;
			steps = 0;
			x = 0;
			y = 0;
		}

		aveSteps /= trials;
		System.out.println("average number of steps = " + aveSteps);
	}
}