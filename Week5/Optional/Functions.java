/******************************************************************************
 2.1.10 Write a static method lg() that takes an int argument n and returns
 the largest integer not larger than the base-2 logarithm of n.
 Do not use the Math library.

 2.1.19 Write a static method histogram() that takes an int array a[] and an
 integer m as arguments and returns an array of length m whose ith element is
 the number of times the integer i appeared in a[]. Assuming the values in a[]
 are all between 0 and m-1, the sum of the values in the returned array should
 equal a.length.
 *****************************************************************************/

public class Functions {
    // answer for 2.1.10
    public static int lg(int n) {
        int x = 0;
        for (int i = n; i > 1; i /= 2) x++;
        return x;
    }

    // answer for 2.1.19
    public static int[] histogram(int[] a, int m) {
        int[] arr = new int[m];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) count++;
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int[] hist = histogram(arr, 5);
        for (int i = 0; i < hist.length; i++) {
            sum += hist[i];
        }

        boolean isEqual = sum == hist.length;
        System.out.println(isEqual + " " + sum + " and " + hist.length);
    }
}
