package com.besmart.hw3.task2;

import java.util.*;

public class MethodExecutionTime {
    public static long addTime (Collection<Integer> collection, int n) {
        //Random random = new Random();
        long startTime = System.nanoTime();
        for(int i = 0; i < n; i++){
            //collection.add(new Integer(random.nextInt()));
            //collection.add(new Integer(collection.size()+i));
            collection.add(collection.size()+i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long insertTime (List<Integer> list, int n) {
        //Random random = new Random();
        int size = list.size();
        long startTime = System.nanoTime();
        //list.add(n, new Integer(random.nextInt()));
        //list.add(new Integer(list.size()));
        list.add(list.size());
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long indexOfTime (List<Integer> list, Integer elem){
        int index = -1;
        long startTime = System.nanoTime();
        index = list.indexOf(elem);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long removeTime(List<Integer> list, int index) {
        Integer deleted;
        long startTime = System.nanoTime();
        deleted = list.remove(index);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long searchTime(Set<Integer> set, Integer elem) {
        long startTime = System.nanoTime();
        set.contains(elem);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long removeTime(Set<Integer> set, Integer elem) {
        long startTime = System.nanoTime();
        set.remove(elem);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long addTime(Map<Integer, Integer> map, int n){
        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++)
            map.put(map.size()+i, map.size()+i);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long searchTime(Map<Integer,Integer> map, int key){
        long startTime = System.nanoTime();
        map.containsKey(key);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long removeTime(Map<Integer, Integer> map, int index){
        long startTime = System.nanoTime();
        map.remove(index);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
