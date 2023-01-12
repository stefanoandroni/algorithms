package searching.iterative;

import utils.constants.Test;
import utils.interfaces.Searching;

/*
    Linear search: A simple algorithm for finding an item in a list by checking each item in the list until the desired
    item is found.
*/

/*
    Time Complexity
        BC: O(1)    k is the first element of the array V
        WC: O(n)    k is not present in array V
        MC: O(n)

        Note
            If the array V is sorted, only the MC is lowered (...).
 */

public class LinearSearch implements Searching {

    @Override
    public <T extends Comparable<T>> int find(T[] V, T k) {
        for (int i = 0; i < V.length; i++) {
            if (V[i].compareTo(k) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.find(Test.V, Test.k));
    }
}
