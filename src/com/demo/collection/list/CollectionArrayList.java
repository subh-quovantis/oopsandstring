package com.demo.collection.list;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {
    void example(){
        List<String> animals = new ArrayList<>();
        animals.add("dog");
        animals.add("cat");
        animals.add("lion");
        animals.add("tiger");
        System.out.println(animals);
        for(String a:animals){
            System.out.println(a);
        }

        animals.set(1,"elephant");
        System.out.println(animals);

        animals.remove(1);
        System.out.println(animals);
        System.out.println(animals.size());
        System.out.println(animals.isEmpty());
        System.out.println(animals.lastIndexOf("tiger"));

    }

    public static void main(String[] args) {
        CollectionArrayList list = new CollectionArrayList();
        list.example();
    }
}
