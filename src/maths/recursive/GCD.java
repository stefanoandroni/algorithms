package maths.recursive;

public class GCD {
    public int GCD(int m, int n) {
        if (m > n) {
            // swap m and n
            int tmp = m;
            m = n;
            n = tmp;
        }

        if (m == 0) {
            return (n);
        }
        return (GCD(m, n - m));
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.GCD(50,120));
    }
}
