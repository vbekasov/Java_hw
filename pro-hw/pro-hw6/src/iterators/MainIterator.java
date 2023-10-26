package iterators;

import java.lang.reflect.Array;
import java.util.*;

public class MainIterator {
    public static void main(String[] args) {
        MyIter it = new MyIter(generateIntArr(6));

        while (it.hasNext())
            System.out.print(it.next() + "  ");

        System.out.println(" ");
        System.out.println(it.next());
    }

    static class MyIter implements Iterator<Integer> {
        private List<Integer> inner;
        private int count = 0;

        public MyIter(int[] inner) {
            this.inner = new ArrayList<>(inner.length);
            for (Integer it : inner)
                this.inner.add(it);

            this.inner.sort(Collections.reverseOrder());
        }

        @Override
        public boolean hasNext() {
            return count < inner.size();
        }

        @Override
        public Integer next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return inner.get(count++);
        }
    }

    private static int[] generateIntArr(int len) {
        Random rnd = new Random();
        int[] ret = new int[len];

        while (--len >= 0)
            ret[len] = rnd.nextInt(-100, 101);

        System.out.println(Arrays.toString(ret));
        return ret;
    }
}
