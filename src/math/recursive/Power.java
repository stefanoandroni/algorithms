package math.recursive;

public class Power {
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return (a * power(a, n - 1));
    }

    /*
        method: divide and conquer
    */
    /*
        Note
            More efficient than the previous impl, but we are doing extra divisions (/2) to avoid extra
            multiplications
    */
    public static int powerDC(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPow = powerDC(a, n/2);
        int fullPow = halfPow * halfPow; // power rule
        if (n % 2 == 1) {
            fullPow = fullPow * a;
        }
        return fullPow;
    }

    public static void main(String[] args) {
        System.out.println(Power.power(6, 8));
        System.out.println(Power.powerDC(6, 8));
    }
}
