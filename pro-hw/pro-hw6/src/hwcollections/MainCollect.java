package hwcollections;

import java.util.*;

public class MainCollect {
    public static void main(String[] args) {
        MyIter<Float> fIt = new MyIter<>(generateFloatList(5));
        while (fIt.hasNext())
            System.out.print(fIt.next() + "  ");
        System.out.println("\n");

        for (MyIter<Integer> iIt = new MyIter<>(generateIntList(5)); iIt.hasNext(); )
            System.out.print(iIt.next() + " ");
        System.out.println(" ");
    }

    static class  MyIter <T extends Comparable> implements Iterator<T> {
        ArrayList<T> inner;
        int count;

        public MyIter(ArrayList<T> inner) {
            this.inner = new ArrayList<>(inner);
        }

        @Override
        public boolean hasNext() {
            return count < inner.size();
        }

        @Override
        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return inner.get(count++);
        }
    }

    private static ArrayList<Float> generateFloatList(int len) {
        Random rnd = new Random();
        ArrayList<Float> ret = new ArrayList<>(len);
        while (--len >= 0)
            ret.add(rnd.nextFloat(-10.0F, 10.0F));

        System.out.println(ret);
        return ret;
    }

    private static ArrayList<Integer> generateIntList(int len) {
        Random rnd = new Random();
        ArrayList<Integer> ret = new ArrayList<>(len);

        while (--len >= 0)
            ret.add(rnd.nextInt(-100, 100));

        System.out.println(ret);
        return ret;
    }
}
