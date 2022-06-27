package com.demo.collection.list;

import java.util.LinkedList;
import java.util.List;

public class CollectionLinkedList {
    void crudExample(){
        List<Integer> numbers = new LinkedList<>();
        for(int i = 0; i<=8;i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        numbers.remove(5);
        System.out.println(numbers);
        numbers.set(5,8);
        System.out.println(numbers);

        System.out.println(numbers.get(4));
        System.out.println(numbers.size());

    }

    public static void main(String[] args) {
        CollectionLinkedList list = new CollectionLinkedList();
        list.crudExample();
    }
}
