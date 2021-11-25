package com.besmart.hw3.task1;

import com.besmart.hw3.task1.ILinkedList;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ILinkedList<E> {

    private class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    private Node<E> first;
    private Node<E> last;
    private int size;

    public int getSize() {
        return size;
    }

    public void add(E data) {
        addToEnd(data);
    }

    private void addToEnd(E data) {
        if (size==0) {
            first = new Node(data);
            last = first;
            first.setNext(last);
            last.setPrev(first);
        } else {
            if (size == 1) {
                last = new Node(data);
                last.setPrev(first);
                first.setNext(last);
            } else {
                Node tmp = new Node(data);
                tmp.setPrev(last);
                last.setNext(tmp);
                last = tmp;
            }
        }
        size++;
    }

    public void add(int index, E data) {
        if (index<0 || index>size) {
            System.out.println("You entered incorrect index. Element didn't add to list.");
        } else {
            if (index==size) addToEnd(data);
            else {
                Node cur = first;
                for (int i=0; i<index; i++)
                    cur = cur.getNext();
                Node tmp = new Node(data, cur.getPrev(), cur);
                cur.setPrev(tmp);
                cur = tmp.getPrev();
                cur.setNext(tmp);
                size++;
            }
        }
    }

    public void clear() {
        for (Node<E> cur = first; cur != null; ) {
            Node<E> next = cur.next;
            cur.element = null;
            cur.next = null;
            cur.prev = null;
            cur = next;
        }
        first = last = null;
        size = 0;
    }

    private Node<E> getCur(int index) {
        Node<E> cur = first;
        for (int i = 0; i < index; i++)
            cur = cur.getNext();
        return cur;
    }


    public E get (int index) {
        if (index<0 || index>=size) {
            System.out.println("Out of bounds, return null");
            return null;
        }
        else {
            return getCur(index).getElement();
        }
    }

    public int indexOf (E element) {
        Node<E> cur = first;
        if (element == null) {
            for (int i=0; i<size; i++) {
                if (cur.getElement()==null) return i;
                cur = cur.getNext();
            }
        } else {
            for (int i=0; i<size; i++) {
                if (element.equals(cur.getElement())) return i;
                cur = cur.getNext();
            }
        }
       return -1;
    }

    /*public E remove(int index) {
        if(index<0 || index>=size) return null;
        else {
            Node<E> cur = getCur(index);
            final E element = cur.getElement();
            final Node<E> next = cur.getNext();
            final Node<E> prev = cur.getPrev();

            if (prev == null) {
                first = next;
            } else {
                prev.next = next;
                cur.prev = null;
            }

            if (next == null) {
                last = prev;
            } else {
                next.prev = prev;
                cur.next = null;
            }

            cur.setElement(null);
            size--;
            return element;
        }
    }*/

    @Override
    public E remove (int index){
        if(index<0 || index>=size) return null;
        Node<E> temp = first;
        if(index == 0){
            first = temp.getNext();
            size --;
            return temp.getElement();
        }
        int curIndex = 0;
        while(curIndex < index - 1){
            temp = temp.getNext();
            curIndex ++;
        }
        E elem = temp.getNext().getElement();
        temp.setNext(temp.getNext().getNext());
        size --;
        return elem;
    }

    public E set(int index, E element) {
        if(index<0 || index>=size) return null;
        else {
            Node<E> cur = getCur(index);
            E oldValue = cur.getElement();
            cur.setElement(element);
            return oldValue;
        }
    }

    private boolean isEmpty() {
        return size==0;
    }

    @Override
    public String toString() {
        String res = "MyLinkedList{";
        if (isEmpty()) res+="}";
        else {
            res += first.getElement().toString();
            for (Node<E> cur = first.getNext(); cur != null; cur = cur.getNext())
                res += ", "+cur.getElement().toString();
            res+="}";
        }
        return res;
    }

    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        for (Node<E> cur = first; cur != null; cur = cur.next)
            result[i++] = cur.getElement();
        return result;
    }

    public <T> T[] toArray(T[] a) {
        if (a.length < size)
            a = (T[])java.lang.reflect.Array.newInstance(
                    a.getClass().getComponentType(), size);
        int i = 0;
        Object[] result = a;
        for (Node<E> cur = first; cur != null; cur = cur.next)
            result[i++] = cur.getElement();

        if (a.length > size)
            a[size] = null;

        return a;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> curNode = first;

            @Override
            public boolean hasNext() {
                return curNode != null;
            }

            @Override
            public E next() throws NoSuchElementException {
                if (!hasNext())
                    throw new NoSuchElementException();

                E element = curNode.getElement();
                curNode = curNode.getNext();
                return element;
            }
        };
    }
}
