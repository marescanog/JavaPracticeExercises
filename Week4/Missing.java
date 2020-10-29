/******************************************************************************
 1.5.7 Write a program that takes an integer command-line argument n, reads
 in n-1 distinct integers between 1 and n, and determines the missing value.
 *****************************************************************************/

public class Missing {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        StdOut.println("Enter in " + (n - 1) + " numbers from 1 to " + n);
        int count = 0;

        while (count < n - 1) {
            int index = StdIn.readInt();

            if (index > n || index <= 0) {
                StdOut.println(index + " is not a number between 1 and " + n);
                StdOut.println("Please enter another number.");
            }
            else if (arr[index - 1] == 0) {
                arr[index - 1] = 1;
                count++;
            }
            else {
                StdOut.println(index + " has already been entered previously");
                StdOut.println("Please enter another number.");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                StdOut.println("Missing number is: " + (i + 1));
                break;
            }
        }
    }
}
