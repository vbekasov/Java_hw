package homework8;

import java.util.*;

/**
 * Homework 8. Tasks One and Two.
 */

public class TwoTasksUtil {
    /**
     * Method <b>swapTwo</b> swaps two elements of the given List
     * using two indexes.
     */
    public static <T> List<T> swapTwo(List<T> arr, int p1, int p2) {
        if (arr == null || arr.isEmpty())
            throw new IllegalArgumentException("Null or Empty List");

        if (p1 < 0 || p2 < 0 || p1 >= arr.size() || p2 >= arr.size())
            throw new IllegalArgumentException("Index out of range");

        if (p1 == p2)
            return arr;

        T tmp = arr.get(p1);
        arr.set(p1, arr.get(p2));
        arr.set(p2, tmp);

        return arr;
    }

    public static <T extends Comparable<T>>  T findMaxInRange(List<T> arr, T lRange, T rRange) {
        T max = null;

        for (T it : arr)
            if (it.compareTo(lRange) >= 0 && it.compareTo(rRange) < 0)
                if (max != null && it.compareTo(max) > 0)
                    max = it;
                else if (max == null)
                    max = it;

        return max;
    }

    private void main(String[] args) {}
}
