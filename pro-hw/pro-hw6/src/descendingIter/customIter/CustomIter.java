package descendingIter.customIter;

import java.util.*;

public class CustomIter<T> implements Iterator<T> {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }
}
