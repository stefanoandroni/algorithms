package sorting.recursive;

/*
    type: divide and conquer
 */

/*
    Merge sort: A divide and conquer sorting algorithm that recursively divides the input list into two halves, sorts
    each half, and then merges the sorted halves back together. This results in a fully sorted list. It is a stable
    sort, meaning that the order of elements with equal keys is preserved.
 */

/*
    Time Complexity
        BC: O(n lg n)
        WC: O(n lg n)
        MC: O(n lg n)
 */

import utils.constants.Test;
import utils.interfaces.Sorting;

import java.util.Arrays;

public class MergeSort implements Sorting {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] V) {
        return sort(V.clone(), 0, V.length - 1);
    }

    private <T extends Comparable<T>> T[] sort(T[] A, int sx, int dx) {
        if (sx < dx) {
            // divide
            int m = (sx + dx) / 2;
            sort(A, sx, m);
            sort(A, m + 1, dx);
            // combine
            merge(A, sx, m, dx); // [sx, m] [m+1, dx]
        }
        return (A);
    }

    private <T extends Comparable<T>> void merge(T[] A, int sx, int m, int dx) {
        // range 1 -> [sx, m]
        // range 2 -> [m+1, dx]
        int bI = sx; // B index
        int sxI = sx; // sx index of interval in A
        int dxI = m + 1; // dx index of interval in A
        T[] B = A.clone(); // TODO: bad

        // combines by comparing the elements of the two ranges
        while (sxI <= m && dxI <= dx) {
            if (A[sxI].compareTo(A[dxI]) <= 0) { // stable sort ( <= -> sx first if equals)
                B[bI] = A[sxI];
                sxI++;
            } else {
                B[bI] = A[dxI];
                dxI++;
            }
            bI++;
        }

        // add elements of range 1 exceeding to B (not compared elements)
        while (sxI <= m) {
            B[bI] = A[sxI];
            bI++;
            sxI++;
        }

        // add elements of range 2 exceeding to B (not compared elements)
        while (dxI <= dx) {
            B[bI] = A[dxI];
            bI++;
            dxI++;
        }

        for (int i = sx; i <= dx; i++) {
            A[i] = B[i];
        }

    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.sort(Test.V)));
    }
}
