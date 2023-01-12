package divideandconquer;

import utils.constants.Test;

/*
    Ex
        In: [7, 3, 3, 3, 7, 1, 4, 1, 1, 1, 1, 1, 5]
                _______           _______
                                        _______
        Out: 3
 */
public class CountTriples {

    public static <T extends Comparable<T>> int countTriples(T[] A) {
        return count(A, 0, A.length - 1);
    }

    private static <T extends Comparable<T>> int count(T[] A, int sx, int dx) {
        if ((dx - sx) <= 1) { // less than 3 items
            return (0);
        }

        int m = (sx + dx) / 2;
        int r1 = count(A, sx, m);
        int r2 = count(A, m + 1, dx);

        int r3 = 0;
        if (A[m - 1].compareTo(A[m]) == 0 && A[m].compareTo(A[m + 1]) == 0) {
            r3++;
        }
        if ((m + 2) < A.length && A[m].compareTo(A[m + 1]) == 0 && A[m].compareTo(A[m + 2]) == 0) {
            r3++;
        }
        return (r1 + r2 + +r3);
    }

    public static void main(String[] args) {
        System.out.println(CountTriples.countTriples(Test.V));
    }

}
