package array.recursive;

import utils.constants.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxValue {

    /*
        method: divide and conquer
    */
    public static <T extends Comparable<T>> T getMaxValueDC(ArrayList<T> v) {
        return getMaxValueDC(v, 0, v.size() - 1);
    }

    private static <T extends Comparable<T>> T getMaxValueDC(ArrayList<T> v, int start, int end) {
        if (start == end) {
            return v.get(start);
        }
        int m = (start + end) / 2;
        T left = getMaxValueDC(v, start, m);
        T right = getMaxValueDC(v, m + 1, end);
        if (left.compareTo(right) > 0) {
            return left;
        } else {
            return right;
        }
    }

    public static <T extends Comparable<T>> T getMaxValue(ArrayList<T> v) {
        if (v.size() == 1) {
            return v.get(0);
        }
        T t = v.remove(v.size() - 1); // (right ?)
        T max = getMaxValue(v);
        if (max.compareTo(t) > 0) {
            return max;
        } else {
            return t;
        }
    }

    public static void main(String[] args) {
        System.out.println(MaxValue.getMaxValue(new ArrayList<Integer>(Arrays.asList(Test.V))));
        System.out.println(MaxValue.getMaxValueDC(new ArrayList<Integer>(Arrays.asList(Test.V))));
    }


}
