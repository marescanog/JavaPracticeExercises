public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        double sumEnt = 0;
        double sum = 0;
        int[] arr = new int[m];

        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            if (num >= 1 && num <= m) {
                arr[num - 1]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            double p = (double) arr[i];
            p /= sum;
            if (p != 0) {
                double ent = p * (Math.log(p) / Math.log(2));
                sumEnt += ent;
            }
        }

        sumEnt *= -1;

        StdOut.printf("%.4f\n", sumEnt);
    }
}
