package matrix.iterative;

import utils.constants.Test;

/*
    Optimization
        Opt1 - it is not useful to check the main diagonal --> M[r][c] == M[c][r] if r == c
        Opt2 - it is not useful to check if M[c][r]==M[r][c] if it has already been checked M[r][c]==M[c][r]
 */
public class SymmetricMatrix {
    /**
     * Precondition: M is a square matrix (n x n)
     */
    public static <T extends Comparable<T>> boolean isSymmetric(T M [][]) {
        int r = 0;
        int c = 1; // Opt1
        int n = M.length;

        while (r < n - 1 && M[r][c].compareTo(M[c][r]) == 0) {
            c ++;
            if (c >= n) {
                r ++;
                c = r + 1; // Opt2
            }
        }

        if (r < n - 1) {
            return false; // while loop stopped due to equality condition
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(SymmetricMatrix.isSymmetric(Test.MSimmetric));
        System.out.println(SymmetricMatrix.isSymmetric(Test.M));
    }
}
