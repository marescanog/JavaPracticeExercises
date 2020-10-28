/*
1.4.33 Find a duplicate. Given an integer array of length n, with each value between 1 and n, write a code fragment to determine whether there are any duplicate values. You may not use an extra array (but you do not need to preserve the contents of the given array.)
*/

public class FindDuplicate
{
 public static void main(String[] args)
 {
  int n = Integer.parseInt(args[0]);
  int[] arr = new int[n];
  boolean isDuplicate = false;

  for(int i=0; i<n; i++)
  {
   arr[i] = (int)(Math.random() *100);
   System.out.print(arr[i] + " ");
  }

  System.out.println("\n");
  for(int i=0; i<n; i++)
  {
   for(int j=i+1; j<n; j++)
   {
    if(arr[i]==arr[j]) 
    {
     System.out.println("Duplicate is: " + arr[i] + " At indexes " + i +" and " + j);
     isDuplicate = true;
     break;
    }
   }
   
   if(isDuplicate) break;
  }

  System.out.println("Duplicates: "+ isDuplicate);
 }
}