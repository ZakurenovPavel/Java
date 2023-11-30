package main.java.hw_iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleIterator<T> implements Iterator<T> {

    private Iterator<T> first;
    private Iterator<T> second;

    private boolean iteratorStatus;
    public DoubleIterator(Iterator<T> first, Iterator<T> second) {
        this.first = first;
        this.second = second;
        this.iteratorStatus = true;

    }

    @Override
    public boolean hasNext() {
        return iteratorStatus ? first.hasNext() : second.hasNext();
    }

    @Override
    public T next() {
        if (iteratorStatus && first.hasNext()) {
            return first.next();
        } else if (second.hasNext()) {
            iteratorStatus = false;
            return second.next();
        } else {
            throw new NoSuchElementException();
        }
    }
}