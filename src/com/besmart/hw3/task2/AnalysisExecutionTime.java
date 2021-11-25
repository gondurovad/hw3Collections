package com.besmart.hw3.task2;

import java.util.*;

public class AnalysisExecutionTime {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i=0; i<70000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        System.out.println("Add to ArrayList: "+ MethodExecutionTime.addTime(arrayList, 100));
        System.out.println("Add to LinkedList: "+ MethodExecutionTime.addTime(linkedList, 100));
        System.out.println("===========");
        System.out.println("Insert to begin of ArrayList: "+ MethodExecutionTime.insertTime(arrayList, 2));
        System.out.println("Insert to begin of LinkedList: "+ MethodExecutionTime.insertTime(linkedList, 2));
        System.out.println("===========");
        System.out.println("Insert into middle of ArrayList: "+ MethodExecutionTime.insertTime(arrayList, arrayList.size()/2));
        System.out.println("Insert into middle of LinkedList: "+ MethodExecutionTime.insertTime(linkedList, linkedList.size()/2));
        System.out.println("===========");
        System.out.println("ArrayList Search: "+ MethodExecutionTime.indexOfTime(arrayList, 20));
        System.out.println("LinkedList Search: "+ MethodExecutionTime.indexOfTime(linkedList, 20));
        System.out.println("===========");
        System.out.println("ArrayList Remove from begin: "+ MethodExecutionTime.removeTime(arrayList, 1));
        System.out.println("LinkedList Remove from begin: "+ MethodExecutionTime.removeTime(linkedList, 1));
        System.out.println("===========");
        System.out.println("ArrayList Remove from end: "+ MethodExecutionTime.removeTime(arrayList, arrayList.size()-3));
        System.out.println("LinkedList Remove from end: "+ MethodExecutionTime.removeTime(linkedList, linkedList.size()-3));
        System.out.println("===========\n");

        HashSet<Integer> hashSet = new HashSet<Integer>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        for (int i=0; i<70000; i++) {
            hashSet.add(i);
            linkedHashSet.add(i);
            treeSet.add(i);
        }

        System.out.println("Add to HashSet: "+ MethodExecutionTime.addTime(hashSet, 100));
        System.out.println("Add to LinkedHashSet: "+ MethodExecutionTime.addTime(linkedHashSet, 100));
        System.out.println("Add to TreeSet: "+ MethodExecutionTime.addTime(treeSet, 100));
        System.out.println("===========");
        System.out.println("HashSet search: "+ MethodExecutionTime.searchTime(hashSet, 20));
        System.out.println("LinkedHashSet search: "+ MethodExecutionTime.searchTime(linkedHashSet, 20));
        System.out.println("TreeSet search: "+ MethodExecutionTime.searchTime(treeSet, 20));
        System.out.println("===========");
        System.out.println("HashSet remove: "+ MethodExecutionTime.removeTime(hashSet, hashSet.size()/2));
        System.out.println("LinkedHashSet remove: "+ MethodExecutionTime.removeTime(linkedHashSet, linkedHashSet.size()/2));
        System.out.println("TreeSet remove: "+ MethodExecutionTime.removeTime(treeSet, treeSet.size()/2));
        System.out.println("===========\n");

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

        System.out.println("Add to HashMap: "+ MethodExecutionTime.addTime(hashMap, 10100));
        System.out.println("Add to LinkedHashMap: "+ MethodExecutionTime.addTime(linkedHashMap, 10100));
        System.out.println("Add to TreeMap: "+ MethodExecutionTime.addTime(treeMap, 10100));
        System.out.println("===========");
        System.out.println("HashMap search: "+ MethodExecutionTime.searchTime(hashMap, 20));
        System.out.println("LinkedHashMap search: "+ MethodExecutionTime.searchTime(linkedHashMap, 20));
        System.out.println("TreeMap search: "+ MethodExecutionTime.searchTime(treeMap, 20));
        System.out.println("===========");
        System.out.println("HashMap remove: "+ MethodExecutionTime.removeTime(hashMap, hashMap.size()/2));
        System.out.println("LinkedHashMap remove: "+ MethodExecutionTime.removeTime(linkedHashMap, linkedHashMap.size()/2));
        System.out.println("TreeMap remove: "+ MethodExecutionTime.removeTime(treeMap, treeMap.size()/2));

    }
}
