package sorting.recursive;

import utils.constants.Test;

import java.util.Arrays;
import java.util.Random;

/*
    QuickSort: It is a divide and conquer algorithm for sorting which selects a 'pivot' element from the array and
    partitions the other elements into two sub-arrays, according to whether they are less than or greater than the
    pivot. It then recursively sorts the sub-arrays. It is also efficient for large dataset and has an average time
    complexity of O(n log n) and worst case O(n^2) but with a good pivot selection it performs well. It also an in-place
    sort which means it doesn't need any extra memory.
*/

/*
    method: divide and conquer
    in place: yes
    stable: no
*/
public class QuickSort { // implements Sorting

    public static <T extends Comparable<T>> T[] sort(T[] V) {
        return sort(V.clone(), 0, V.length - 1);
    }

    private static <T extends Comparable<T>> T[] sort(T[] A, int start, int end) {
        /*
            if (start == end) {
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

    private static <T extends Comparable<T>> int Partition(T[] A, int start, int end) {
        // Initialize two pointers, one starting from the left of the partition and one from the right
        int sx = start - 1;
        int dx = end + 1;

        // V1: Choose the first element as the pivot
        T pivot = A[start];

        /*
        // V2: Randomized pivot version
        // Generate a random index between start and end inclusive as the pivot
        Random rand = new Random();
        int pivotIndex = start + rand.nextInt(end - start + 1);
        T pivot = A[pivotIndex];
        //Swap the pivot element with the first element of the partition
        A[pivotIndex] = A[start];
        A[start]=pivot;
        */

        while (sx < dx) {
            // Move the left pointer to the right until an element greater than or equal to the pivot is found
            do {
                sx++;
            } while (sx < A.length - 1 && A[sx].compareTo(pivot) < 0);

            // Move the right pointer to the left until an element less than or equal to the pivot is found
            do {
                dx--;
            } while (dx > 0 && A[dx].compareTo(pivot) > 0);

            // If the left pointer is still less than the right pointer, swap the elements at those positions
            if (sx < dx) {
                T tmp = A[sx];
                A[sx] = A[dx];
                A[dx] = tmp;
            }
        }

        // Return the final position of the pivot
        return dx;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(QuickSort.sort(Test.V)));
    }
}
