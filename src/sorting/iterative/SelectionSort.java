package sorting.iterative;

import utils.constants.Test;
import utils.interfaces.Sorting;

import java.util.Arrays;

/*
    Selection sort: A simple sorting algorithm that repeatedly selects the next smallest(/largest) element from the
    unsorted portion of the list and places it at the end of the sorted portion.
 */

/*
    Time Complexity
        BC: O(n^2)
        WC: O(n^2)
        MC: O(n^2)
 */
public class SelectionSort implements Sorting {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] V) {
        T[] A = V.clone();
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
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.sort(Test.V)));
    }
}
