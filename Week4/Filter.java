/******************************************************************************
 1.5.6 Write a filter that reads in a sequence of integers and prints the
 integers, removing repeated values that appear consecutively. For example,
 if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1 1 1 1 1 1 1 1, your program should
 print 1 2 1 5 1 7 1.
 *****************************************************************************/

public class Filter {
    public static void main(String[] args) {
        boolean isFirstTime = true;
        int previousNum = 0;
        int currentNum;
        String listNum = "";
        while (!StdIn.isEmpty()) {
            currentNum = StdIn.readInt();

            if (isFirstTime) {
                listNum += currentNum + " ";
                previousNum = currentNum;
                isFirstTime = false;
            }
            else {
                if (previousNum != currentNum) {
                    listNum += currentNum + " ";
                    previousNum = currentNum;
                }
            }
        }
        StdOut.println(listNum);
    }
}
