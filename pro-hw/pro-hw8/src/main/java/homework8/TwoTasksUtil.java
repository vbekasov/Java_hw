package homework8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

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

    public static <T>  T findMaxInRange(List<? extends Comparator> arr, T lRange, T rRange) {
        T max = (T) arr.get(0);

        for (Comparator it : arr)
            if (it.compare(it, lRange) >= 0 && it.compare(it, rRange) < 0 &&
                    it.compare(it, max) > 0)
                max = (T) it;

    }

    public static void main(String[] args) {
        List<Integer> tst = new ArrayList<>();
        tst.add(Integer.valueOf(1));
        tst.add(2);
        //tst.add(3);
        //tst.add(4);
        //tst.add(5);

        System.out.println(findMaxInRange(tst, Integer.parseInt("-2"), 3));
    }
}
