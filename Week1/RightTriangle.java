public class RightTriangle
{
	public static void main(String[] args)
	{
	        long x = Integer.parseInt(args[0]); 
	        long y = Integer.parseInt(args[1]); 
	        long z = Integer.parseInt(args[2]); 
		
		long a = Math.min(Math.min(x, y), z);
		long c = Math.max(Math.max(x, y), z);
		long b = x + y + z - a - c;

		boolean arePositive = (a > 0) && (b > 0) && (c > 0) ;
		boolean isEqual = (a*a + b*b) == c*c;
		boolean isRightTriangle = arePositive && isEqual;
 
		System.out.println(isRightTriangle);
	}
}