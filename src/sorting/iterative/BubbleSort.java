package sorting.iterative;

import sorting.recursive.MergeSort;
import utils.constants.Test;

import java.util.Arrays;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(T[] A) {
        int n = A.length;

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (A[j].compareTo(A[j + 1]) > 0) {
                    T tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
    }

    public static void main(String[] args) {
        Integer [] A = Test.V.clone();
        BubbleSort.sort(A);
        System.out.println(Arrays.toString(A));
    }
}
