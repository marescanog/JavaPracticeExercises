public class GreatCircle
{

	public static void main(String[] args)
	{
		double x1 = Math.toRadians(Double.parseDouble(args[0]));
		double y1 = Math.toRadians(Double.parseDouble(args[1]));
		double x2 = Math.toRadians(Double.parseDouble(args[2]));
		double y2 = Math.toRadians(Double.parseDouble(args[3]));

		double part1 = Math.sin((x2-x1)/2);
		part1 *= part1;
		double part2 = Math.cos(x1) * Math.cos(x2);
		double part3 = Math.sin((y2-y1)/2); 
		part3 *= part3;	
		
		double distance = Math.asin(Math.sqrt(part1+part2*part3));
		
		distance =2*6371.0*distance;

		System.out.println(distance + " kilometers");
	}
}