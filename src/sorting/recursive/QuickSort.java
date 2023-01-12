package sorting.recursive;

import utils.constants.Test;
import utils.interfaces.Sorting;

import java.util.Arrays;

/*
    type: divide and conquer
*/

/*
    QuickSort: It is a divide and conquer algorithm for sorting which selects a 'pivot' element from the array and
    partitions the other elements into two sub-arrays, according to whether they are less than or greater than the
    pivot. It then recursively sorts the sub-arrays. It is also efficient for large dataset and has an average time
    complexity of O(n log n) and worst case O(n^2) but with a good pivot selection it performs well. It also an in-place
    sort which means it doesn't need any extra memory.

    > In place
    > Not stable
*/
public class QuickSort implements Sorting {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] V) {
        return sort(V.clone(), 0, V.length - 1);
    }

    private <T extends Comparable<T>> T[] sort(T[] A, int start, int end) {
        /*
            if (sx == dx) {
                // do nothing
            }
        */
        if (start < end) { // the array contains at least 2 items
            // divide
            int m = Partition(A, start, end);
            // impera
            sort(A, start, m);
            sort(A, m + 1, end);
            // combine
            // None
        }
        return A;
    }

    private <T extends Comparable<T>> int Partition(T[] A, int start, int end) {
        int sx = start - 1;
        int dx = end + 1;
        T pivot = A[start];

        while (sx < dx) {

            do {
                sx ++;
            } while (sx < A.length - 1 && A[sx].compareTo(pivot) < 0);

            do {
                dx --;
            } while (dx > 0 && A[dx].compareTo(pivot) > 0);

            if (sx < dx) {
                T tmp = A[sx];
                A[sx] = A[dx];
                A[dx] = tmp;
            }
        }
        return dx;
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        System.out.println(Arrays.toString(quickSort.sort(Test.V)));
    }
}
