package com.demo.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        System.out.println("keys"+map.keySet());
        System.out.println("values"+map.values());
        System.out.println("Key-Value pairs: "+map.entrySet());


    }
}
