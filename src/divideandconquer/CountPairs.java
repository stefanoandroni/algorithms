package divideandconquer;

import utils.constants.Test;

/*
    Ex
        In: [7, 3, 3, 7, 1, 4, 1, 1, 1, 5]
                ____           ____
                                  ____
        Out: 3
 */
public class CountPairs {
    public static <T extends Comparable<T>> int countPairs(T[] A) {
        return count(A, 0, A.length - 1);
    }

    private static <T extends Comparable<T>> int count(T[] A, int sx, int dx) {
        if (sx == dx) {
            return (0);
        }

        int m = (sx + dx) / 2;
        int r1 = count(A, sx, m);
        int r2 = count(A, m + 1, dx);

        int r3 = 0;
        if (A[m].compareTo(A[m + 1]) == 0) {
            r3 = 1;
        }

        return (r1 + r2 + r3);
    }

    public static void main(String[] args) {
        System.out.println(CountPairs.countPairs(Test.V));
    }
}
