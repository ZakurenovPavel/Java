package main.java.hw_classes;

import main.java.interfaces.List;
import main.java.hw_iterator.MyIterator;

public class MyLinkedList<E> implements List<E>, Iterable<E> {

  public Node<E> head;
  private Node<E> tail;
  private int size;

  public MyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public MyLinkedList(Node<E> head, Node<E> tail) {
    this.head = head;
    this.tail = tail;
  }

  public void add(E el) {
    Node<E> newNode = new Node<>(el, tail, null);
    if (size == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      newNode.previous = tail;
      tail = newNode;
    }
    size++;
  }

  public void insertHead(E el) {
    Node<E> newNode = new Node<>(el, null, head);
    if (head != null) {
      head.previous = newNode;
    }
    head = newNode;
    if (tail == null) {
      tail = newNode;
    }
    size++;
  }

  public void printList() {
    Node<E> current = head;
    while (current != null) {
      System.out.print(current.element + " ");
      current = current.next;
    }
  }

  @Override
  public void add(int index, E el) {
    if (index < 0 || index > size) {
      throw new IndexOutOfBoundsException("Выход за границы");
    }
    if (index == 0) {
      insertHead(el);
    } else if (index == size) {
      add(el);
    } else {
      Node<E> current = getNode(index);
      Node<E> myNode = new Node<>(el, current.previous, current);
      if (current.previous != null) {
        current.previous.next = myNode;
      }
      current.previous = myNode;
      size++;
    }
  }

  @Override
  public E get(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Выход за границы");
    }
    Node<E> current = getNode(index);
    return current.element;
  }

  public Node<E> getNode(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Выход за границы");
    }
    Node<E> current;
    if (index >= size / 2) {
      current = tail;
      for (int i = size - 1; i > index; i--) {
        current = current.previous;
      }
    } else {
      current = head;
      for (int i = 0; i < index; i++) {
        current = current.next;
      }
    }
    return current;
  }

  @Override
  public void remove(int index) {
    if (index < 0 || index >= size) {
      throw new IndexOutOfBoundsException("Выход за границы");
    }
    Node<E> current = getNode(index);
    E element = current.element;
    Node<E> next = current.next;
    Node<E> previous = current.previous;

    if (previous != null) {
      previous.next = next;
      current.previous = null;
    } else {
      head = next;
    }
    if (next != null) {
      next.previous = previous;
      current.next = null;
    } else {
      tail = previous;
    }
    current.element = null;
    size--;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  public E getFirst() {
    if (head == null) {
      return null;
    }
    return head.element;
  }

  public E getLast() {
    if (tail == null) {
      return null;
    }
    return tail.element;
  }

  public void clear() {
    head = null;
    tail = null;
    size = 0;
  }

  @Override
  public MyIterator<E> iterator() {
    return new MyIterator<>(new MyLinkedList<>(head, tail));
  }

  public static class Node<E> {

    public E element;
    public Node<E> next;
    public Node<E> previous;

    public Node(E element, Node<E> next, Node<E> previous) {
      this.element = element;
      this.next = next;
      this.previous = previous;
    }
  }
}