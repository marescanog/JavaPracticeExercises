public class AudioCollage {
    public static double[] amplify(double[] a, double alpha) {
        double[] arr = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i] * alpha;
        }
        return arr;
    }

    public static double[] reverse(double[] a) {
        double[] arr = new double[a.length];
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            arr[j] = a[i];
        }
        return arr;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] arr = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        for (int i = a.length, j = 0; j < b.length; i++, j++) {
            arr[i] = b[j];
        }
        return arr;
    }

    public static double[] mix(double[] a, double[] b) {
        double[] arr = new double[Math.max(a.length, b.length)];

        if (a.length == b.length) {
            for (int i = 0; i < b.length; i++) {
                arr[i] = a[i] + b[i];
            }
        }
        else if (a.length > b.length) {
            for (int i = 0; i < b.length; i++) {
                arr[i] = a[i] + b[i];
            }
            for (int i = b.length; i < a.length; i++) {
                arr[i] = a[i];
            }
        }
        else {
            for (int i = 0; i < a.length; i++) {
                arr[i] = a[i] + b[i];
            }
            for (int i = a.length; i < b.length; i++) {
                arr[i] = b[i];
            }
        }

        return arr;
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        if (alpha == 0) return a;
        int alphaNew = (int) (a.length / alpha);
        double[] arr = new double[alphaNew];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a[((int) (i * alpha))];
        }
        return arr;
    }

    public static void main(String[] args) {
        double[] sample = StdAudio.read("cow.wav");
        double[] sample2 = StdAudio.read("piano.wav");

        StdAudio.play(amplify(sample, 3));
        StdAudio.play(reverse(sample));
        StdAudio.play(merge(sample, sample2));
        StdAudio.play(mix(sample, sample2));
        StdAudio.play(changeSpeed(sample, 0.5));
    }
}
