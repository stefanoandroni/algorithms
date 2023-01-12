package maths.recursive;

public class Power {
    public int power(int a, int n) {
        if (n == 0) {
            return (1);
        }
        return (a * power(a, n - 1));
    }

    public static void main(String[] args) {
        Power power = new Power();
        System.out.println(power.power(6, 8));
    }
}
