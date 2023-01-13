package sorting.iterative;

import utils.constants.Test;

import java.util.Arrays;

/*
    Insertion sort: A simple sorting algorithm that builds the final sorted list one item at a time by repeatedly
    inserting the next item into the correct position in the already sorted portion of the list.

 */

/*
    method: incremental
*/

/*
    > is an efficient algorithm for sorting a small number of elements
*/

/*
    Time Complexity
        BC: O(n)    V is sorted (never enters the while loop)
        WC: O(n^2)  V is sorted in reverse (while loop exits only when i reaches -1)
        MC: O(n^2)
 */

public class InsertionSort { // implements Sorting

    public static <T extends Comparable<T>> T[] sort(T[] V) {
        T[] A = V.clone(); // return a copy
        for (int j = 1; j < A.length; j++) {
            T k = A[j];
            // Insert A[j] into the sorted subarray A[0:j-1].
            int i = j - 1;
            while (i >= 0 && k.compareTo(A[i]) < 0) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = k;
        }
        return (A);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(InsertionSort.sort(Test.V)));
    }
}
