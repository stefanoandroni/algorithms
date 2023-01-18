package sorting.iterative;

import utils.constants.Test;

import java.util.Arrays;

/*
    Selection sort: A simple sorting algorithm that repeatedly selects the next smallest(/largest) element from the
    unsorted portion of the list and places it at the end of the sorted portion.
 */

/*
    method: incremental
    in place: yes
    stable: no
*/

/*
    Time Complexity
        BC: O(n^2)  V is sorted
        WC: O(n^2)  'if' statement always true
        MC: O(n^2)
 */
public class SelectionSort { // implements Sorting

    public static <T extends Comparable<T>> T[] sort(T[] V) {
        T[] A = V.clone(); // return a copy
        for (int i = 0; i < A.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j].compareTo(A[minPos]) < 0) {
                    minPos = j;
                }
            }
            T tmp = A[i];
            A[i] = A[minPos];
            A[minPos] = tmp;
        }
        return (A);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SelectionSort.sort(Test.V)));
    }
}
