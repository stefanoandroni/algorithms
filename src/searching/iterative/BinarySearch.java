package searching.iterative;

import utils.constants.Test;

/*
    Binary search: An efficient algorithm for finding an item in a sorted list of items by repeatedly dividing the
    search interval in half.
*/

/*
    Time Complexity
        BC: O(1)            k is in the middle position of the array V
        WC: O(log(2)n)      k is not present in array V
        MC: O(log(2)n)
 */

public class BinarySearch { // implements Searching

    /**
     * Precondition: V sorted (in ascending order)
     */
    public static <T extends Comparable<T>> int find(T[] V, T k) {
        int sx = 0;
        int dx = V.length - 1;
        int m = (sx + dx) / 2;

        while (V[m].compareTo(k) != 0 && sx <= dx) {
            if (V[m].compareTo(k) < 0)
                sx = m + 1;
            else
                dx = m - 1;

            m = (sx + dx) / 2;
        }

        if (sx <= dx)
            return (m);

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch.find(Test.VSorted, Test.k));
    }
}
