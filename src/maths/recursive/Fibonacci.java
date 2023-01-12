package maths.recursive;

/*
    Time Complexity: O(2^n)

        Note
            Case where the recursive algorithm has higher complexity than the iterative version
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if(n == 1 || n == 2) {
            return (1);
        }
        int r1 = fibonacci(n - 1);
        int r2 = fibonacci(n - 2);
        return (r1 + r2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(15));
    }
}
