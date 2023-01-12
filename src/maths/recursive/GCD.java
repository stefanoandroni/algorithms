package maths.recursive;

public class GCD {
    public static int gcd(int m, int n) {
        if (m > n) {
            // swap m and n
            int tmp = m;
            m = n;
            n = tmp;
        }

        if (m == 0) {
            return (n);
        }
        return (gcd(m, n - m));
    }

    public static void main(String[] args) {
        System.out.println(GCD.gcd(50, 120));
    }
}
