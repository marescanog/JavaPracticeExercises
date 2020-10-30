public class Divisors {
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 && b == 0) return 0;
        a = Math.abs(a);
        b = Math.abs(b);
        return (a / gcd(a, b)) * b;
    }

    public static boolean areRelativelyPrime(int a, int b) {
        return 1 == gcd(a, b);
    }

    public static int totient(int n) {
        if (n == 1) return 1;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (areRelativelyPrime(n, i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        StdOut.println("gcd(" + a + ", " + b + ") = " + gcd(a, b));
        StdOut.println("lcm(" + a + ", " + b + ") = " + lcm(a, b));
        StdOut.println("areRelativelyPrime(" + a + ", " + b + ") = " + areRelativelyPrime(a, b));
        StdOut.println("totient(" + a + ") = " + totient(a));
        StdOut.println("totient(" + b + ") = " + totient(b));
    }
}
