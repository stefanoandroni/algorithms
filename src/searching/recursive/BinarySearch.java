package searching.recursive;

import utils.constants.Test;

/*
    Binary search: An efficient algorithm for finding an item in a sorted list of items by repeatedly dividing the
    search interval in half.
*/
/*
    type: divide and conquer (?)
*/
public class BinarySearch { // implements Searching

    /**
     * Precondition: V sorted (in ascending order)
     */
    public static <T extends Comparable<T>> int find(T[] V, T k) {
        return findRecursive(V, 0, V.length - 1, k);
    }

    private static <T extends Comparable<T>> int findRecursive(T[] A, int sx, int dx, T k) {
        if (sx > dx) {
            return -1;
        }
        int m = (sx + dx) / 2;
        if (A[m].compareTo(k) == 0) {
            return m;
        }
        if (A[m].compareTo(k) > 0) {
            return findRecursive(A, sx, m - 1, k);
        } else {
            return findRecursive(A, m + 1, dx, k);
        }
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch.find(Test.VSorted, Test.k));
    }

}
