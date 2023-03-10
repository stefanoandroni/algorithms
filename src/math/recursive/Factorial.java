package math.recursive;

/*
    Time Complexity: O(n)
    Space Complexity: O(n)
 */
public class Factorial {
    public static long factorial(int n) {
        if (n == 0) {
            return (1);
        }
        return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(6));
    }
}