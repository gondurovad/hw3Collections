package com.besmart.hw3.task1;

import java.util.Iterator;

public interface ILinkedList<E> extends Iterable<E>{
    void add (E element);
    void add (int index, E element);
    void clear();
    E get (int index);
    int indexOf (E element);
    E remove(int index);
    E set (int index, E element);
    int getSize();
    Object[] toArray();
    <E> E[] toArray(E[] a);
    String toString ();
}
