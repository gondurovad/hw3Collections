package com.besmart.hw3.task1;

import java.util.LinkedList;
import java.util.Random;

public class MethodExecutionTime {
    static long addTime (MyLinkedList<Integer> list, int n) {
        //Random random = new Random();
        long startTime = System.nanoTime();
        for(int i = 0; i < n; i++){
            //list.add(new Integer(random.nextInt()));
            list.add(list.getSize() + i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long addTime (LinkedList<Integer> list, int n) {
        //Random random = new Random();
        long startTime = System.nanoTime();
        for(int i = 0; i < n; i++){
            list.add(list.size() + i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long indexOfTime (MyLinkedList<Integer> list, Integer elem){
        int index = -1;
        long startTime = System.nanoTime();
        index = list.indexOf(elem);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long indexOfTime (LinkedList<Integer> list, Integer elem){
        int index = -1;
        long startTime = System.nanoTime();
        index = list.indexOf(elem);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long removeTime(MyLinkedList<Integer> list, int index) {
        Integer deleted;
        long startTime = System.nanoTime();
        deleted = list.remove(index);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    static long removeTime(LinkedList<Integer> list, int index) {
        Integer deleted;
        long startTime = System.nanoTime();
        deleted = list.remove(index);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
