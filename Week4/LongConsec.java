/******************************************************************************
 1.5.5 Write a program that reads in a sequence of integers and prints both the
 integer that appears in a longest consecutive run and the length of that run.
 For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1, then your program
 should print Longest run: 4 consecutive 7s.
 *****************************************************************************/

public class LongConsec {
    public static void main(String[] args) {

        int currentNum;
        int previousNum = 0;
        int maxNum = 0;
        int maxCount = 0;
        int currentCount = 0;
        boolean isFirstTime = true;

        while (!StdIn.isEmpty()) {
            currentNum = StdIn.readInt();

            if (isFirstTime) {
                previousNum = currentNum;
                isFirstTime = false;
            }
            else {
                if (previousNum == currentNum) {
                    currentCount++;
                }
                else {
                    if (maxCount < currentCount) {
                        maxCount = currentCount;
                        maxNum = previousNum;
                    }
                    currentCount = 0;
                    previousNum = currentNum;
                }
            }
        }

        StdOut.println();
        for (int i = 0; i <= maxCount; i++) {
            StdOut.print(maxNum + " ");
        }
    }
}
