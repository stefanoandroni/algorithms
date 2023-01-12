package maths.recursive;

public class Power {
    public static int power(int a, int n) {
        if (n == 0) {
            return (1);
        }
        return (a * power(a, n - 1));
    }

    public static void main(String[] args) {
        System.out.println(Power.power(6, 8));
    }
}
