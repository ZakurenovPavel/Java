package main.java.hw_iterator;

import java.util.Iterator;
import main.java.hw_classes.MyLinkedList;

public class MyIterator<T> implements Iterator<T> {
    private MyLinkedList<T> myLinkedList;
    private int value;

    public MyIterator(MyLinkedList<T> myLinkedList) {
        this.myLinkedList = myLinkedList;
        value = 0;
    }

    @Override
    public boolean hasNext() {
        return value < myLinkedList.size();
    }

    @Override
    public T next() {
        return myLinkedList.get(value++);
    }

    public boolean hasPrevious() {
        return value > 0;
    }

    public T previous() {
        return myLinkedList.get(--value);
    }
}