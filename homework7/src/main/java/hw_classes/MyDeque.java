package main.java.hw_classes;

import java.util.NoSuchElementException;
import java.util.Stack;
import main.java.interfaces.Deque;

public class MyDeque<E> implements Deque<E> {

  private Stack<E> leftStack = new Stack<>();
  private Stack<E> rightStack = new Stack<>();

  @Override
  public void addFirst(E e) {
    leftStack.push(e);
  }

  @Override
  public void addLast(E e) {
    while (!leftStack.isEmpty()) {
      rightStack.push(leftStack.pop());
    }
    rightStack.push(e);
    while (!rightStack.isEmpty()) {
      leftStack.push(rightStack.pop());
    }
  }


  @Override
  public E removeFirst() {
    if (leftStack.isEmpty()) {
      throw new NoSuchElementException();
    }
    return leftStack.pop();
  }

  @Override
  public E removeLast() {
    if (leftStack.isEmpty()) {
      throw new NoSuchElementException();
    }
    while (!leftStack.isEmpty()) {
      rightStack.push(leftStack.pop());
    }
    E extra = rightStack.pop();
    while (rightStack.isEmpty()) {
      leftStack.push(rightStack.pop());
    }
    return extra;
  }

  @Override
  public E peekFirst() {
    return leftStack.peek();
  }

  @Override
  public E peekLast() {
    while (!leftStack.isEmpty()) {
      rightStack.push(leftStack.pop());
    }
    E extra = rightStack.peek();
    while (!rightStack.isEmpty()) {
      leftStack.push((rightStack.pop()));
    }
    return extra;
  }

  @Override
  public boolean isEmpty() {
    return leftStack.isEmpty();
  }

  @Override
  public int size() {
    return leftStack.size();
  }

  @Override
  public void printDeque() {
    while (!leftStack.isEmpty()) {
      rightStack.push(leftStack.pop());
    }
    while (!rightStack.isEmpty()) {
      System.out.println(rightStack.pop());
    }

  }
}
