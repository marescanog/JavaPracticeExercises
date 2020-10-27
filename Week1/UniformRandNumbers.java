public class UniformRandNumbers
{
   public static void main(String[] args)
   {
      double min;
      double max;
      double num1 = Math.random();
      double num2 = Math.random();
      max = Math.max(num1, num2);
      min = Math.min(num1, num2);
      double num3 = Math.random();
      max = Math.max(max, num3);
      min = Math.min(min, num3);
      double num4 = Math.random();
      max = Math.max(max, num4);
      min = Math.min(min, num4);
      double num5 = Math.random();
      max = Math.max(max, num5);
      min = Math.min(min, num5);

      double ave = (num1 + num2 + num3 + num4 + num5)/5;
      
      System.out.print(num1 + " "+ num2 + " " + num3 + " " + num4 + " " + num5);	
      System.out.println("The Average is: " + ave);
      System.out.println("The minimum value is: " + min);
      System.out.println("The maximum value is: " + max);	
   }

}