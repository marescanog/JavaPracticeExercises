public class ThreeSort
{
    public static void main(String[] args)
	{
	     int x = Integer.parseInt(args[0]); 
	     int y = Integer.parseInt(args[1]); 
	     int z = Integer.parseInt(args[2]); 
		
		int first = Math.min(Math.min(x, y), z);
		int last = Math.max(Math.max(x, y), z);
                int minStep1 = Math.min(x, y);
                int minStep2 = Math.min(Math.max(x,y), z);
		int middle = Math.max(minStep1, minStep2);
	   System.out.println(first + " " + middle + " " + last);	
	}


}