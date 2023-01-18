package sorting.recursive;

import utils.constants.Test;

import java.util.Arrays;

/*
    Bubble sort: A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements and swaps
    them if they are in the wrong order. The pass through the list is repeated until the list is sorted.
 */

/*
    method: incremental
    in place: yes
    stable: yes
*/

/*
    Note
        This implementation uses the same logic as the iterative version, but instead of using a loop to iterate over
        the array multiple times, it uses a recursive function call to sort a sub-array of the input array.
 */

/*
    Time Complexity
        WC: O(n^2)
        MC: O(n^2)
*/
public class BubbleSort {

    public static <T extends Comparable<T>> void sort(T[] A) {
        sort(A, A.length);
    }

    public static <T extends Comparable<T>> void sort(T[] A, int n) {
        if (n == 1) return; // base case: if the array has only one element, it's already sorted
        for (int i = 0; i < n - 1; i++) {
            if (A[i].compareTo(A[i + 1]) > 0) {
                T tmp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = tmp;
            }
        }
        sort(A, n - 1); // recursive call to sort the sub-array
    }

    public static void main(String[] args) {
        Integer [] A = Test.V.clone();
        BubbleSort.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
