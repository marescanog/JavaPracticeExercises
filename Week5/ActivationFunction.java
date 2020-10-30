public class ActivationFunction {
    public static double heaviside(double x) {
        if (x < 0) return 0.0;
        if (x == 0) return 0.5;
        if (x > 0) return 1.0;
        else return Double.NaN;
    }

    public static double sigmoid(double x) {
        if (x == Double.POSITIVE_INFINITY) return 1.0;
        if (x == Double.NEGATIVE_INFINITY) return 0.0;
        else if (Double.isNaN(x)) return Double.NaN;
        else return 1.0 / (1.0 + Math.exp(-x));
    }

    public static double tanh(double x) {
        if (x >= 20.0) return 1.0;
        if (x <= -20.0) return -1.0;
        else if (Double.isNaN(x)) return Double.NaN;
        else return (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
    }

    public static double softsign(double x) {
        if (x == Double.POSITIVE_INFINITY) return 1.0;
        if (x == Double.NEGATIVE_INFINITY) return -1.0;
        else if (Double.isNaN(x)) return Double.NaN;
        else return x / (1.0 + Math.abs(x));
    }

    public static double sqnl(double x) {
        if (x <= -2.0) return -1.0;
        if (x > -2 && x < 0) return x + ((x * x) / 4);
        if (x >= 0 && x < 2) return x - ((x * x) / 4);
        if (x >= 2.0) return 1.0;
        if (Double.isInfinite(x)) return Double.NaN;
        else return Double.NaN;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.println("heaviside(" + x + ") = " + heaviside(x));
        StdOut.println("  sigmoid(" + x + ") = " + sigmoid(x));
        StdOut.println("     tanh(" + x + ") = " + tanh(x));
        StdOut.println(" softsign(" + x + ") = " + softsign(x));
        StdOut.println("     sqnl(" + x + ") = " + sqnl(x));
        /*
        StdOut.printf("heaviside(%f) = %f\n", x, heaviside(x));
        StdOut.printf(" sigmoid (%f) = %f\n", x, sigmoid(x));
        StdOut.printf("     tanh(%f) = %f\n", x, tanh(x));
        StdOut.printf(" softsign(%f) = %f\n", x, softsign(x));
        StdOut.printf("     sqnl(%f) = %f\n", x, sqnl(x));
         */
    }
}
