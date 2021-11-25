package com.besmart.hw3.task1;

import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        //сравнение функциональности MyLinkedList и LinkedList
        MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i=0; i<50000; i++) {
            myList.add(i);
            list.add(i);
        }

        System.out.println("Add into MyLinkedList: "+MethodExecutionTime.addTime(myList, 1000));
        System.out.println("Add into LinkedList: "+MethodExecutionTime.addTime(list, 1000));
        System.out.println("===========");
        System.out.println("Search MyLinkedList: "+MethodExecutionTime.indexOfTime(myList, 50));
        System.out.println("Search LinkedList: "+MethodExecutionTime.indexOfTime(list, 50));
        System.out.println("===========");
        System.out.println("Remove MyLinkedList: "+MethodExecutionTime.removeTime(myList, 50));
        System.out.println("Remove LinkedList: "+MethodExecutionTime.removeTime(list, 50));

        //тестирование функциональности MyLinkedList
        MyLinkedList<Integer> myListTest = new MyLinkedList<Integer>();

        for (int i=0; i<20; i++) {
            myListTest.add(i);
            list.add(i);
        }

        System.out.println(myListTest.get(10).getClass()); //видим, что произошла автоупаковка
        System.out.println(myListTest);                    //тестирование toString
        System.out.println(myListTest.getSize());          //получить размер
        myListTest.set(5, 55);    //изменить значение
        myListTest.add(55);       //добавить в конец
        System.out.println(myListTest);
        myListTest.add(1, 70);         //добавить элемент по индексу
        myListTest.add(50, 88);        //пытаемся добавить по несуществующему индексу
        System.out.println(myListTest);           //проверяем, добавилось ли
        System.out.println(myListTest.indexOf(10)+", "+myListTest.indexOf(100));          //ищем индексы
        System.out.println(myListTest.getSize());
        System.out.println(myListTest.remove(1)+", "+myListTest.remove(-10)); //удаляем
        System.out.println(myListTest.getSize());
        System.out.println(myListTest);
        System.out.println(myListTest.get(5));    //берем элемент по индексу
        System.out.println(myListTest.get(-10));  //пытаемся взять элемент по несуществующему индексу
        Integer[] intArray1 = myListTest.toArray(new Integer[0]);
        Object[] intArray2 = myListTest.toArray();
        System.out.println(intArray1.getClass());
        myListTest.clear();
        System.out.println(myListTest);
    }
}
