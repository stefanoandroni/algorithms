package sorting.recursive;

/*
    Merge sort: A divide and conquer sorting algorithm that recursively divides the input list into two halves, sorts
    each half, and then merges the sorted halves back together. This results in a fully sorted list. It is a stable
    sort, meaning that the order of elements with equal keys is preserved.
 */

/*
    method: divide and conquer
    in place: no
    stable: yes
    comparison: yes
*/

/*
    Time Complexity
        BC: O(n lg n)
        WC: O(n lg n)
        MC: O(n lg n)
 */

import utils.constants.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

    public static <T extends Comparable<T>> void sort(T[] V) {
        sort(V, 0, V.length - 1);
    }

    private static <T extends Comparable<T>> void sort(T[] A, int sx, int dx) {
        // Base Case
        // if (sx == dx) --> subarray of 1 element --> already sorted

        if (sx < dx) {
            // divide
            int m = (sx + dx) / 2;
            // conquer
            sort(A, sx, m);
            sort(A, m + 1, dx);
            // combine
            merge(A, sx, m, dx);
        }
    }

    /**
     * It merges the two sorted subarrays (A[sx:m] and A[m+1:dx]) to form a single sorted subarray that replaces the
     * current subarray (A[sx:dx]).
     *
     * @param A
     * @param sx
     * @param m
     * @param dx
     * @param <T>
     */
    private static <T extends Comparable<T>> void merge(T[] A, int sx, int m, int dx) {

        int i1 = sx; // index for subarray 1     A[sx:m]
        int i2 = m + 1; // index for subarray 2  A[m+1:dx]

        List<T> tmp = new ArrayList<>(dx - sx);

        // Merge by comparing the elements of the two subarrays
        while (i1 <= m && i2 <= dx) {
            if (A[i1].compareTo(A[i2]) <= 0) { // stable sort ( <= -> sx first if equals)
                tmp.add(A[i1]);
                i1++;
            } else {
                tmp.add(A[i2]);
                i2++;
            }
        }

        // W1: add the remaining elements of subarray 1 (not compared elements)
        while (i1 <= m) {
            tmp.add(A[i1]);
            i1++;
        }

        // W2: add the remaining elements of subarray 2 (not compared elements)
        while (i2 <= dx) {
            tmp.add(A[i2]);
            i2++;
        }

        // Note: execution of W1 excludes execution of W2 and vice versa

        // Update A
        int b = 0;
        for (int j = sx; j <= dx; j++) {
            A[j] = tmp.get(b);
            b++;
        }

    }

    public static void main(String[] args) {
        Integer [] A = Test.V.clone();
        MergeSort.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
