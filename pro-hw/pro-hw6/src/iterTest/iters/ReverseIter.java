package iterTest.iters;

import java.util.*;

public class ReverseIter implements Iterable<Integer>{
    private ArrayList<Integer> inner = null;
    private MyIerator iter;

    private ReverseIter(int[] inner) {
        this.inner = new ArrayList<>(inner.length);
        for (int j : inner) {
            this.inner.add(j);
        }
        this.inner.sort(Comparator.reverseOrder());
        this.iter =

    }

    public static ReverseIter makeIter(int[] input) {
        ReverseIter tmp = new  ReverseIter(input);
        return tmp;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIerator();
    }

    private class MyIerator implements Iterator<Integer> {
        int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < inner.size();
        }

        @Override
        public Integer next() {
            if (!hasNext())
                throw new NoSuchElementException();

            return inner.get(pos++);
        }
    }
}
