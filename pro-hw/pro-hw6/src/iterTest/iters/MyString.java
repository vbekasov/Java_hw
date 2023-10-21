package iterTest.iters;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyString implements Iterable<Character>{
    private String str;

    {
        str = "SOME TEXT";
    }

    @Override
    public Iterator<Character> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Character> {
        int pos = 0;

        @Override
        public boolean hasNext() {
            return pos < str.length();
        }

        @Override
        public Character next() {
            if (!hasNext())
                throw new NoSuchElementException();
            return str.charAt(pos++);
        }
    }
}
