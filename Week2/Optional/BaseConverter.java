/*
1.3.21 Write a program Kary that takes two integer command line arguments i and k and converts i to base k. Assume that i is an integer in Java’s long data type and that k is an integer between 2 and 16. For bases greater than 10, use the letters A through F to represent the 11th through 16th digits, respectively.
*/

public class BaseConverter
{
	public static void main(String[] args)
	{
		long i = Long.parseLong(args[0]);
		int k = Integer.parseInt(args[1]);
		String converted = "";

		while(i>0)
		{
			long remainder = i%k;

			if(remainder == 10) converted = "A" + converted;
			else if(remainder == 10) converted = "A" + converted;
			else if(remainder == 11) converted = "B" + converted;	
			else if(remainder == 12) converted = "C" + converted;	
			else if(remainder == 13) converted = "D" + converted;	
			else if(remainder == 14) converted = "E" + converted;	
			else if(remainder == 15) converted = "F" + converted;			
			else converted = remainder + converted;
			i/=k;	
		}
		
		System.out.println(converted);
	}
}