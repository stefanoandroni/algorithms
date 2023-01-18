package sorting.iterative;

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
    Time Complexity
        WC: O(n^2)
        MC: O(n^2)
*/
public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++) // outer loop to iterate over the array
            for (int j = 0; j < n - i - 1; j++) // inner loop to iterate over sub-array
                if (A[j].compareTo(A[j + 1]) > 0) { // compare the current element with the next one
                    T tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
        /*
            Note
                The inner loop iterates until j < n - i - 1 because with each iteration of the outer loop, the largest
                element in the array "bubbles" to the end of the array, so it is not necessary to check it again (the
                largest element of the array is bubbled to the end).
        */
    }

    public static void main(String[] args) {
        Integer [] A = Test.V.clone();
        BubbleSort.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
