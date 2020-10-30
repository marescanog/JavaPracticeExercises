/******************************************************************************
 2.1.29 Fourier spikes. Write a program that takes a command-line argument n
 and plots the function (cos(t) + cos(2 t) + cos(3 t) + … + cos(n t)) / n for
 500 equally spaced samples of t from -10 to 10 (in radians). Run your
 program for n = 5 and n = 500. Note : You will observe that the sum converges
 to a spike (0 everywhere except a single value). This property is the basis
 for a proof that any smooth function can be expressed as a sum of sinusoids.
 *****************************************************************************/

public class Fourier {

    public static double function(int n, double t) {
        if (n == 0) return 0;
        double c = 0;

        for (int i = 1; i <= n; i++) {
            c += Math.cos(i * t);
        }
        c /= n;
        c = Math.toRadians(c);
        return c;
    }

    public static double[] generateSample() {
        double[] sample = new double[500];
        double num = -10.0;
        for (int i = 0; i < sample.length; i++) {
            num += 0.04;
            sample[i] = num;
        }
        return sample;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] sample = generateSample();

        // the function y = sin(4x) + sin(20x), sampled at 500 points
        double[] x = new double[500];
        double[] y = new double[500];
        for (int i = 0; i < sample.length; i++) {
            x[i] = sample[i];
            y[i] = function(n, sample[i]);
            // StdOut.println(x[i] + " " + y[i]);
        }

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < y.length; i++) {
            max = Math.max(y[i], max);
            min = Math.min(y[i], min);
        }
        // rescale the coordinate system
        StdDraw.setXscale(-10.5, 10.5);
        StdDraw.setYscale(min, max);

        // plot the approximation to the function
        for (int i = 0; i < 499; i++) {
            StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);
        }
    }
}
