public class RandomWalker
{
	public static void main(String[] args)
	{
		int r = Integer.parseInt(args[0]);
		int x = 0;
		int y = 0;
		int distance = 0;
		int steps = 0;
		
		distance = Math.abs(x) + Math.abs(y);
		while (distance != r)
		{
			System.out.println( "("+ x + ", " + y + ")");
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


		System.out.println( "("+ x + ", " + y + ")");
		System.out.println("steps = " + steps);
	}
}