package maths.iterative;

/*
    Time Complexity: O(n)
    Space Complexity: O(1)
 */
public class Factorial {
    public static long factorial(int n) {
        long f = 1;
        // for (int i = 1; i <= n; f *= i, ++i);
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return (f);
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(6));
    }
}
