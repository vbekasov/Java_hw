package iterTest;

import iterTest.iters.MyString;
import iterTest.iters.ReverseIter;

import java.util.*;

public class MainTest {
    public static void main(String[] args) {
        MyString myStr = new MyString();
        Iterator<Character>  it1 =  myStr.iterator();
        while (it1.hasNext())
            System.out.print(it1.next() + " ");
        System.out.println(" ");

        List<Integer> iInt = List.of(34, 643, 5, 85, 36);
        Iterator<Integer> it2 = new Iterator<Integer>() {
            private final ArrayList<Integer> inner = new ArrayList<>(iInt);
            private int it = 0;
            {
                inner.sort(Comparator.reverseOrder());
            }
            @Override
            public boolean hasNext() {
                return it < inner.size();
            }

            @Override
            public Integer next() {
                if (!hasNext())
                    throw new NoSuchElementException();
                return inner.get(it++);
            };
        };

        while (it2.hasNext())
            System.out.print(it2.next() + " ");
        System.out.println(" ");


        int[] arr = {432, 64, -64, 7, 2, -25, 3, 0};
        ReverseIter it3 = ReverseIter.makeIter(arr);
        while (it3.hasNext())
            System.out.println();
    }
}
