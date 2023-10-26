package iterators;

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
        private ArrayList<Integer> inner;
        private int count = 0;

        public MyIter(ArrayList<Integer> inner) {
            this.inner = inner;
            this.inner.sort(Collections.reverseOrder());
            System.out.println(this.inner);
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

    private static ArrayList<Integer> generateIntArr(int len) {
        Random rnd = new Random();
        ArrayList<Integer> ret = new ArrayList<>(len);

        while (--len >= 0)
            ret.add(rnd.nextInt(-100, 101));

        return ret;
    }
}
